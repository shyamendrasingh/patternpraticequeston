package patternpraticeQuestions;
import java.util.*;
public class Question6 {
 public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	
	int nst=n;
	int nsp=1;
	int row=1;
	
	while(row<=n)
	{
		for(int csp=1;csp<=nsp;csp++)
		{
			System.out.print(" ");
		}
		for(int cst=1;cst<=nst;cst++)
		{
			System.out.print("*");
		}
		System.out.println();
		nst=nst-1;
		nsp=nsp+2;
		row++;
		
	}
}
	
}
