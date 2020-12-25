package patternpraticeQuestions;
import java.util.*;
public class Question15 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     int nsp=1;
     int nst=n;
    
     int nr=2*n-1;
     int row=1;
     while(row<=nr)
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
    	  if(row<=nr/2)
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
//    	 nst=nst-1;
//    	 nsp=nsp+2;
    	 row=row+1;
      }
	}
}


	


