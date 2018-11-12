package com.annotations;

import java.lang.reflect.Method;
import java.text.Annotation;

public class Test1 {

	public static void main(String[] args) throws Exception, SecurityException {
		// TODO Auto-generated method stub
		Student s = new Student("s-111","Durga","hyd");
		//Student s1 = new Student("s-222","Durga1","hyd1");
		s.getStudentDetails();
		Class c=s.getClass();
	Method m = 	c.getMethod("getStudentDetails");
	java.lang.annotation.Annotation ann=m.getAnnotation(Course.class);
	//Annotation ann = (Annotation) c.getAnnotation(Course.class);
	
		
		
	//java.lang.annotation.Annotation	ann1=c.getAnnotation(Course.class);
	
	Course crs = (Course)ann;
	System.out.println("Student Course Details:");
	System.out.println("---------------");
	System.out.println("CourseId:"+crs.cid());
	System.out.println("CourseName:"+crs.cname());
	System.out.println("CourseCost:"+crs.cCost());
	

	}

}
