package programs;

public class pattern4 {

	public static void main(String[] args) {

       int star=1;
       int line =7;
       int mid=((line+1)/2);
       
       for(int j=1;j<=line;j++)
       {
    	   for(int i=1;i<=star;i++)
    	   {
    		  System.out.print("*"); 
    	   }
    	   
    	   System.out.println();
        
    	  if(j<mid)
    	   {
    		   star++;
    	   }
    	   else
    	   {
    		   star--;
    	   }
    	 }
      
	}

}
