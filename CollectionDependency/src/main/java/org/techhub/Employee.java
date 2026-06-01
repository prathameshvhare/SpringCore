package org.techhub;

import java.util.List;

public class Employee {

	private List<String> names;
	public void setNames(List<String> names) {
		this.names=names;
	}
	
	public void showList() {
		for(String s:names)
		{
			System.out.println(s);
		}
	}
}
