package io.gitee.hai2007.servicer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servicer {

	int port;
	String lineSeparator = System.getProperty("line.separator", "\n");

	public Servicer(int port) {
		this.port = port;
	}

	public void run(Handler handler) throws IOException, InterruptedException {

		System.out.println("-----------StartUp-----------");
		System.out.println("http://127.0.0.1:" + this.port);
		System.out.println("\n");

		ServerSocket server = null;

		try {

			server = new ServerSocket(this.port);

			while (true) {
				Socket socket = server.accept();

				InputStreamReader reader = new InputStreamReader(socket.getInputStream());
				GetData getData = new GetData(reader);

				Thread thread = new Thread(getData);
				thread.start();

				Thread.sleep(100);
				String infoStr = getData.valueOf();

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
