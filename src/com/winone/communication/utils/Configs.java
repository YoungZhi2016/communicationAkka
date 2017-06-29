package com.winone.communication.utils;

/**
 * 
 * @author ywkj config
 *
 */
public final class Configs {

	/**
	 * application.conf
	 */
	private static ConfigUtil configApplication = new ConfigUtil();

	/**
	 * application value Integer
	 */
	private static int getApplicationInt(String key, int defaultValue) {
		return configApplication.getInt(key, defaultValue);
	}

	/**
	 * application value String
	 */
	private static String getApplicationString(String key, String defaultValue) {
		return configApplication.getString(key, defaultValue);
	}

	/**
	 * @return local AKKA port
	 */
	public static int getAkkaPort() {
		return getApplicationInt("local_akka_port", 2552);
	}

	/**
	 * @return local AKKA hostName
	 */
	public static String getAkkaHost() {
		return getApplicationString("local_akka_host", "127.0.0.1");
	}

}
