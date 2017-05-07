package com.demo.elk;

import org.apache.log4j.Logger;

public class Application {
	private static final Logger LOGGER = Logger.getLogger(Application.class);

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			LOGGER.error("===YYTTYY===Info log [" + i + "]===YYTTYY===");
			Thread.sleep(500);
		}
	}
}