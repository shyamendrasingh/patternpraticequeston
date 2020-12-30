package patternpraticeQuestions;
import java.util.*;
public class Question18 {

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     int nsp=n/2;
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
    		 System.out.print("*"+" ");
    		 cst++;
    	 }
    	 if(row<=n/2)
    	 {
    		 nst=nst-1;
    		 nsp=nsp+2;	 
    	 }
    	 else
    	 {
    		 nst=nst+1;
    		 nsp=nsp-2;
    	 }
    	 System.out.println();
    	 row=row+1;
     }
     
	}

}
