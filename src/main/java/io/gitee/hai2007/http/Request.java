package io.gitee.hai2007.http;

import java.util.HashMap;

public class Request {

	HashMap<String, String> headerMap = new HashMap<String, String>();
	String data = "";
	String lineSeparator = System.getProperty("line.separator", "\n");

	public Request(String code) {

		String[] codeArray = (code.trim() + lineSeparator + lineSeparator).split(lineSeparator + lineSeparator);

		String[] headerArray = codeArray[0].trim().split(lineSeparator);
		for (int index = 1; index < headerArray.length; index++) {
			String[] item = headerArray[index].split(": ");
			headerMap.put(item[0].trim(), item[1].trim());
		}
		data = codeArray[1];

	}

	public String toString() {
		String codeStr = "{" + lineSeparator;
		codeStr += "    header:{";

		for (String key : headerMap.keySet()) {
			codeStr += lineSeparator + "        " + key + " : " + headerMap.get(key);
		}
		codeStr += lineSeparator + "    }," + lineSeparator;
		codeStr += "    data:" + data;
		return codeStr + lineSeparator + "}";
	}

	public String getHeader(String keyName) {
		return headerMap.get(keyName);
	}

	public String getData() {
		return data;
	}

}
