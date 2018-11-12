package com.callable2;

import java.util.concurrent.Callable;

public class MyTask1 implements Callable
{
  private Integer number;
  
  
	public MyTask1(Integer number) {
		
	this.number = number;
}


	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=number;i++) {
			sum=sum+i;
			
		}
		return sum;
	}

}
