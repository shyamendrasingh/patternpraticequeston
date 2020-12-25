package patternpraticeQuestions;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int nst=n;
		int nsp=1;
		
		int i;int j;
		int row=1;
		while(row<=n) {
		    for(i=1;i<=n;i++)
		    {
		    	for(j=1;j<=m;j++)
		    	{
		    		if(i==1||i==n||j==1||j==m)
		    		{
		    			System.out.print("*");
		    		}
		    		else
		    		{
		    			System.out.print(" ");
		    		}
		    		
		    	}
		    }
		    System.out.println();
		    row=row+1;
		}
		
	}
}
		
		
