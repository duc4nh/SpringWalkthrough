package com.fdmgroup.springwalkthrough.dataaccess;

public class ConnectionFactory {

	private String url;
	private String username;
	private String password;
	private int port;
	
	public ConnectionFactory() {
		System.out.println("Connection factory instantiated");
	}

	public void checkFactorySetup() {
		System.out.println("Factory setup");
		System.out.println("Url: " + url);
		System.out.println("Username: " + username);
	}
	
	public void configDBshutdown() {
		System.out.println("Factory destroyed");
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
}
