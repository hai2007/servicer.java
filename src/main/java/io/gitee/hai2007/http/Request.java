package io.gitee.hai2007.http;

import java.util.HashMap;

public class Request {

	HashMap<String, String> headerMap = new HashMap<String, String>();
	String data = "";

	public Request(String code) {

		String[] codeArray = (code.trim() + "\n\n ").split("\n\n");

		String[] headerArray = codeArray[0].trim().split("\n");
		for (int index = 1; index < headerArray.length; index++) {
			String[] item = headerArray[index].split(": ");
			headerMap.put(item[0].trim(), item[1].trim());
		}
		data = codeArray[1];

	}

	public String toString() {
		String codeStr = "{\n";
		codeStr += "    header:{";

		for (String key : headerMap.keySet()) {
			codeStr += "\n        " + key + " : " + headerMap.get(key);
		}
		codeStr += "\n    },\n";
		codeStr += "    data:" + data;
		return codeStr + "\n}";
	}

	public String getHeader(String keyName) {
		return headerMap.get(keyName);
	}

	public String getData() {
		return data;
	}

}
