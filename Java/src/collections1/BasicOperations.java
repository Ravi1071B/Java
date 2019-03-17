package collections1;

import java.util.ArrayList;

public class BasicOperations {

	public static void main(String[] args) {

             ArrayList<String> al = new ArrayList<String>();
             
             al.add("Ravi");
             al.add("Hyd");
             al.add("Ravi1");
             al.add("Hyd");
             al.add("BLR");
             
             
             System.out.println("Initial Elements of array is:" + al);
             
             // remove specific element to array list
             
            /* al.remove("BLR");
             System.out.println("Remove elements from arraya is :" + al);*/
             
             //Removing element on the basis of specific position  
             
             /*al.remove(0);
             System.out.println("Remove element basis of index is:"+ al);*/
             
             /*al.remove(4);
             System.out.println("Remove element basis of index is:"+ al);*/
             
           
                     
             ArrayList<String> al2 = new ArrayList<String>();
                   al2.add("RAVI");
                   al2.add("HYD10");
                   al2.add("BLR10");
                   // add new elements to arraList
                   al.addAll(al2);
                   
                   System.out.println("Add new Elements to arrayList is:" + al);
                   
                   al.removeAll(al2);
                   System.out.println("Remove all elements from arraylist is :" + al);
                   
                   
                   al.clear();
                   System.out.println("clear all elements  form array is :" +al);
             
             
	}

}
