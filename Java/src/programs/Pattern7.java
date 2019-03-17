package programs;

public class Pattern7 {

	public static void main(String[] args) {

		   int star=1;
		   int line=4;
		   int space=line-1;
		   
		   for(int j=1;j<=line;j++)
		   {
			   for(int k=1;k<=space;k++)
			   {
				  System.out.print(" "); 
			   }
			   
			   for(int i=1;i<=star;i++)
			   {
				  System.out.print("* "); 
			   }
			   System.out.println();
		  
			   space--;
			   star=star+2;
			   
			   
		   }
		  

	}

}
