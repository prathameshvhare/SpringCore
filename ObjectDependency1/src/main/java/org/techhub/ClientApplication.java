package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Test.xml");
		
		MSME msme=(MSME)context.getBean("m");
		msme.showCompanyDetails();
   	}

}
