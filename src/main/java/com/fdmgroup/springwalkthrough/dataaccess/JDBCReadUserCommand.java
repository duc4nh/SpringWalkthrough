package com.fdmgroup.springwalkthrough.dataaccess;

public class JDBCReadUserCommand {

	private ConnectionFactory connectionFactory;

	public JDBCReadUserCommand(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
		System.out.println("Connection Factory injected: " + this.connectionFactory);
	}
	
	
}
