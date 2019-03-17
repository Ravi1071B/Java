package collections1;

import java.util.ArrayList;

public class Arraylist20 {

	public static void main(String[] args) 
	{

		ArrayList al = new ArrayList();

		al.add( new Emp001(111,"ravi"));
		
		al.add(new Student(222,"ravi1"));
		
		Student s1=(Student)al.get(1);
		System.out.println(s1.sid +" "+  s1.sname);
		     
		     Object s=al.get(1);
		     if(s instanceof Emp001)
		     {
		    	        Emp001  e=(Emp001)s;
		    	        System.out.println(e.eid +" "+  e.ename);
		    	 
		     }
		     
		     if(s instanceof Student)
		     {
		    	 Student  s2=(Student)s;
		    	        System.out.println( s2.sid + " " + s2.sname);
		    	 
		     }

	}

}
