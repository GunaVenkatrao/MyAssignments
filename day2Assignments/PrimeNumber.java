package week1.day2Assignments;

public class PrimeNumber 
{

	public static void main(String[] args)
	{
		int no=19;
		boolean b=false;
		
		for(int i=2;i<no;i++)
		{
			int rem;
			rem=no%i;
			
			if (rem==0)
			{
				b=true;
				break;
			}
			
			
		}
 if (b==true)
 {
	 System.out.println("This is not a prime number " +no);
 }
 else
 {
	 System.out.println("This is a prime number " +no);
 }
	}

}
