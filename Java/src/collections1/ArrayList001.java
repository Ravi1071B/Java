package collections1;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ArrayList001 {

	public static void main(String[] args) {	

ArrayList al = new ArrayList();

al.add( new Emp001(111,"ravi"));
al.add(new Student(222,"ravi1"));

al.add(10);
al.add(null);
al.add("Ravi");
al.add("Ravi");

//System.out.println(al.toString());

//System.out.println(al);

for(Object s:al)
{
	     if(s instanceof Emp001)
	     {
	    	        Emp001  e=(Emp001)s;
	    	        System.out.println(e.eid +" "+  e.ename);
	    	 
	     }
	     
	     if(s instanceof Student)
	     {
	    	 Student  s1=(Student)s;
	    	        System.out.println( s1.sid + " " + s1.sname);
	    	 
	     }
	     
	     
	     if(s instanceof Integer)
	     {
	    	 System.out.println(s);
	    	 
	     }
	     
	     
	     if(s instanceof String)
	     {
	    	 System.out.println(s);
	    	 
	     }
	     
	     if(s ==null)
	     {
	    	 System.out.println(s);
	    	 
	     }
	     
	     
	
}
       
	 
   

}
}
