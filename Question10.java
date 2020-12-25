package patternpraticeQuestions;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
	 Scanner sc= new Scanner (System.in);
	 int n=sc.nextInt();
	 
	 int nsp=1;
	 int nst=2*n-1;
	 int row=1;
	 while(row<=n)
	 {
		   int csp=1;
		   while(csp<=nsp)
		   {
			   System.out.print(" "+" ");
			   csp++;
		   }
		   int cst=1;
		   while(cst<=nst)
		   {
			   System.out.print("*"+" ");
			   cst++;
			   
		   }
		   while(csp<=nsp)
		   {
			   System.out.print(" "+" ");
			   csp++;
		   } 
		 System.out.println();
		 nsp=nsp+1;
		 nst=nst-2;
		 row=row+1;
	 }

	}

}
