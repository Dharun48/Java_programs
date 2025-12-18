/******************************************************************************
Q17. Write a Java program to check whether a given number is a Harshad Number or not.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int temp=n;int sum=0;
	   while(temp>0)
	   {
	       int rem=temp%10;
	       sum+=rem;
	       temp/=10;
	   }
	  if(n%sum==0)
	    System.out.println("Harshad number");
	    else
	    System.out.println("Not a Harshad number");
	  
	   
	}
}

