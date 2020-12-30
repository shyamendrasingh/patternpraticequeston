package patternpraticeQuestions;
import java.util.*;
public class Question26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int nst=1;
		int nsp=n-1;
		//int val=1;
		int row=1;
		while(row<=n)
		{
			 int val=1;
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" "+"\t");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{ 
				
				System.out.print(val+"\t");
				cst++;
				val=val+1;
			}
			System.out.println();
			nst=nst+2;
			nsp=nsp-1;
			row=row+1;
			val=val-1;
		
		}

	}

}
