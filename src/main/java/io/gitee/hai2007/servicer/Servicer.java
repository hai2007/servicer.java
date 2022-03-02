package io.gitee.hai2007.servicer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servicer {

	int port;

	public Servicer(int port) {
		this.port = port;
	}

	public void run(Handler handler) throws IOException {

		System.out.println("-----------启动服务器-----------");

		ServerSocket server = null;
		String lineSeparator = System.getProperty("line.separator", "\n");

		try {

			server = new ServerSocket(this.port);

			while (true) {
				Socket socket = server.accept();

				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				String infoStr = "";
				String curStr = reader.readLine();
				while (curStr != null && curStr.length() > 0) {
					infoStr += curStr + lineSeparator;
					curStr = reader.readLine();
				}

				// 处理服务器请求并返回处理结果
				String result = handler.doResolve(infoStr);

				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				writer.write(result);
				writer.flush();

				socket.shutdownInput();
				socket.shutdownOutput();
				socket.close();

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			// 保证一定关闭
			if (server != null && !server.isClosed()) {
				server.close();
			}
		}
	}

}
