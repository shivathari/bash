package com.annotations;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		ArrayList list = bank.get_Customers_details();
		System.out.println(list);

	}

}
class Bank 
{
     @SuppressWarnings("unchecked")
	public ArrayList get_Customers_details()
	{
		ArrayList al = new ArrayList();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		return al;
		
	}
}
