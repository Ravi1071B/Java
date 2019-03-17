package collections1;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {


		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Ravi");
		al.add("Swagen");
		al.add("Swagen1");
		al.add("Swagen");
		
		
		for(String str:al)
		{
			System.out.println("Print elements in a Array List is :" + str);
			
		}
	}

}
