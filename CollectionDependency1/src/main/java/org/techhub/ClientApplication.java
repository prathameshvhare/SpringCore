package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Text.xml");
		
		Dept dept=(Dept)context.getBean("d");
		dept.showDpetList();

	}

}
