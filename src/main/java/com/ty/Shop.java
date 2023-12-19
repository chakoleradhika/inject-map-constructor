package com.ty;

import java.util.Map;

public class Shop 
{
	private String name;
	private Map<String, Double> items;
	public Shop(String name, Map<String, Double> items) {
		
		this.name = name;
		this.items = items;
	}
	
	public void display()
	{
		System.out.println("shop name : "+name);
		System.out.println("============items==========");
		for(Map.Entry<String, Double> entry:items.entrySet())
		{
			System.out.println(entry.getKey()+"----->"+entry.getValue());
		}
	}

}
