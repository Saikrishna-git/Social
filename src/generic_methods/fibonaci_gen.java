package generic_methods;

public class fibonaci_gen
{
	public void fibo(int no)
	{
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.println(fib1+""+fib2);
		for (int i = 1; i < no; i++) 
		{
		 fib3=fib1+fib2;
		 System.out.print(fib3+"");
		 fib1=fib2;
		 fib2=fib3;
		}
		
	}
	
}
