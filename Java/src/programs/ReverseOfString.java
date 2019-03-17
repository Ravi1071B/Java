package programs;

public class ReverseOfString {

	public static void main(String[] args) {

          String str="RaviHyd";
          
              String rev=" ";
              
              int length = str.length();    
              // lenth() is a method it is used to find length of string
              
              for(int i=length-1;i>=0;i--)
              {
            	     rev=rev+str.charAt(i);
            	     System.out.println(rev);
              }
          

	}

}
