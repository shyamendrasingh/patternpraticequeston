package patternpraticeQuestions;
import java.util.*;
public class Question11{

	public static void main(String[] args) {
	 Scanner sc= new Scanner (System.in);
	 int n=sc.nextInt();
	 
	 int nsp=n-1;
	 int nst=1;
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
			 if(cst%2==0)
			 {
				 System.out.print(" "+" ");
			 }
			 else
			 {
				 System.out.print("*"+" ");
			 }
			 cst++;
			 
		 }
		 System.out.println();
		 nsp=nsp-1;
		 nst=nst+2;
		 row=row+1;
	 }

	}

}
