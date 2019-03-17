package programs;

public class pattern2 {

	public static void main(String[] args) {

       int star=1;
       int line =5;
       
       for(int j=1;j<=line;j++)
       {
    	   for(int i=1;i<=star;i++)
    	   {
    		  System.out.print("*"); 
    	   }
    	   
    	   System.out.println();
    	   star++;
       }
	}

}
