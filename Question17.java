package patternpraticeQuestions;
import java.util.*;
public class Question17 {

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     int nsp=1;
     int nst=n-1;
     
     int row=1;
     while(row<=n)
     {
    	
    	 int cst=1;
    	 while(cst<=nst)
    	 {
    		 System.out.print("*");
    		 cst++;
    	 }
    	 int csp=1;
    	 while(csp<=nsp)
    	 {
    		 System.out.print(" ");
    		 csp++;
    	 }
    	 if(row<=n/2)
    	 {
    		 nst=nst-2;
    		 nsp=nsp+2;
    	 }
    	 else
    	 {
    		 nst=nst+2;
    		 nsp=nsp-1;
    	 }
    	
    	 System.out.println();
    	 row=row+1;
     }
     
	}

}
