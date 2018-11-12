package com.annotations;

public class Student
{
	String sid;
	String sname;
	String saddr;
	
	public Student(String sid,String sname,String saddr)
	{
		this.sid= sid;
		this.sname=sname;
		this.saddr=saddr;
		
	}
	//public void Student1(String sid,String sname,String saddr)
	//{
		//this.sid= sid;
		//this.sname=sname;
		//this.saddr=saddr;
		
	//}
	
	@Course(cid="c-333",cname= "java",cCost=30000)
	public void getStudentDetails()
	{
		System.out.println("Student Details");
		System.out.println("---------------------");
		System.out.println("StudentId:"+sid);
		System.out.println("StudentAdress:"+sname);
		System.out.println("StudentName:"+saddr);
		
		
	
	}
}


