package generic_methods;

public class factorial_gen 
{
	public void fact(int no )
	{
		int fact=1;
		for (int i = no; i >=1; i--) 
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
