package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CilentApplication {
	public static void main(String [] x) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Test.xml");
		
		Courier c=(Courier)context.getBean("c");
		Parcel p=c.getParcel();
		System.out.println(p.getId() + "\t" +p.getName() +"\t" +p.getPrice());;
	}

}
