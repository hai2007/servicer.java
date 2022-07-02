package io.gitee.hai2007.servicer;

import java.io.IOException;
import java.net.ServerSocket;

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
				Thread thread = new Thread(new Respond(handler, server.accept()));
				thread.start();

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
