package patternpraticeQuestions;
import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int nst=1;
		
		int row=1;
		
		while(row<=2*n-1)
		{
			 int cst=1;
			 while(cst<=nst)
			 {
				 System.out.print("*"+" ");
				 cst++;
				
			 }
			 if(row<=n-1)
			 {
				 nst=nst+1;
			 }
			 else
			 {
				 nst=nst-1;
			 }
			 System.out.println();
		    // nst=nst+1;
			 row++;
		}
	}

}
