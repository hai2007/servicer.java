package io.gitee.hai2007.servicer;

import java.io.IOException;
import java.io.InputStreamReader;

public class GetData implements Runnable {

	private InputStreamReader reader;
	private String infoStr;

	public GetData(InputStreamReader reader) {
		this.reader = reader;
	}

	public void run() {

		this.infoStr = "";

		int len = -1;
		System.out.println("0" + this.infoStr);
		try {
			while ((len = this.reader.read()) != -1) {
				this.infoStr += String.valueOf(((char) len));
			}
		} catch (Exception e) {
			try {
				this.reader.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

	public String valueOf() {
		return this.infoStr;
	}

}
