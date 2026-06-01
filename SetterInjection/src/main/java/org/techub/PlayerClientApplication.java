package org.techub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerClientApplication {
	public static void main(String [] x)
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Player.xml");
		
		Player p=(Player)context.getBean("p");
		
		System.out.println(p.getId() +"\t" + p.getName() + "\t" + p.getRun());
	}

}
