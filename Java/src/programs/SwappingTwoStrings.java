package programs;

public class SwappingTwoStrings {

	public static void main(String[] args) {

           String a="Ravi";
           String b="Sandeep";
           
           a=a+b;
           
           b=a.substring(0, a.length()-b.length());
           a=a.substring(b.length());
           
           System.out.println(a);
           System.out.println(b);
           
           

	}

}
