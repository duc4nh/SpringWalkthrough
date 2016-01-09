package com.fdmgroup.springwalkthrough;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fdmgroup.springwalkthrough.dataaccess.ConnectionFactory;
import com.fdmgroup.springwalkthrough.dataaccess.JDBCReadUserCommand;

public class Runner {
	
	public static void main(String[] args) {
		
		// Tells Spring to start up and read of the instruction inside context.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/context.xml");
		
		//ConnectionFactory connectionFactory = new ConnectionFactory();
		//JDBCReadUserCommand command = new JDBCReadUserCommand(connectionFactory);
		
		context.close();
	}
}