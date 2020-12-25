package patternpraticeQuestions;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {  
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 
		
		 
		 int row=1;
		 
		 while(row<=n)
		 {
			 if(row==1||row==5)
			 {
				 for(int cst=1;cst<=n;cst++)
				 {
					 if(cst==1||cst==5)
					 {
						 System.out.print("*"+" ");
					 }
					 else
					 {
						 System.out.print(" ");
					 }
				 }
				 
			 }
			 if(row==2||row==4)
			 {
				 for(int cst=1;cst<=n;cst++)
				 {
					 if(cst==2||cst==4)
					 {
						 System.out.print("*"+" ");
					 }
					 else
					 {
						 System.out.print(" ");
					 }
				 }
				 
			 }
			 if(row==3)
			 {
				 for(int cst=1;cst<=n;cst++)
				 {
					 if(cst==3)
					 {
						 System.out.print("*"+" ");
					 }
					 else
					 {
						 System.out.print(" ");
					 }
				 }
				 
			 }

			 System.out.println();
			 row++;
		 }
		 

	}

}
