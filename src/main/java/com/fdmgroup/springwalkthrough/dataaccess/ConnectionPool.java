package com.fdmgroup.springwalkthrough.dataaccess;

public class ConnectionPool {

	private ConnectionFactory connectionFactory;
	private int minSize;
	private int maxSize;
	
	public ConnectionPool(ConnectionFactory connectionFactory, int minSize, int maxSize) {
		this.connectionFactory = connectionFactory;
		this.minSize = minSize;
		this.maxSize = maxSize;
	}
		
	
}
