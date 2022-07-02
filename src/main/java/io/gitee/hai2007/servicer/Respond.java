package io.gitee.hai2007.servicer;

import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Respond implements Runnable {

	private Handler handler;
	private Socket socket;

	public Respond(Handler handler, Socket socket) {
		this.handler = handler;
		this.socket = socket;
	}

	public void run() {

		try {

			InputStreamReader reader = new InputStreamReader(this.socket.getInputStream());
			GetData getData = new GetData(reader);

			Thread thread = new Thread(getData);
			thread.start();

			Thread.sleep(100);
			String infoStr = getData.valueOf();

			// 处理服务器请求并返回处理结果
			String result = this.handler.doResolve(infoStr);

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
			writer.write(result);
			writer.flush();

			this.socket.shutdownInput();
			this.socket.shutdownOutput();
			this.socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
