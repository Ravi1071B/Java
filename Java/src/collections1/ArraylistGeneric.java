package collections1;

import java.util.ArrayList;

public class ArraylistGeneric {

	public static void main(String[] args) {


		ArrayList<Emp001> al = new ArrayList<Emp001>();
		ArrayList<Student> al1 = new ArrayList<Student>();
		
		   al.add(new Emp001(111,"Ravi"));
		   al1.add(new Student(1,"Ravi"));
		   
		   
		   for(Emp001 e:al)
		   {
			   System.out.println(e.eid+" "+e.ename);
		   }
		   
		 
	}

}
