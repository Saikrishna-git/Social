package generic_methods;

public class vowels_constant_gen 
{
	public void count(String name)
	{
		int count=0;
		int count1=0;
		for (int i = 0; i < name.length()-1; i++) 
		{
		 char ch=name.charAt(i);
		 if ((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
		 {
			count++;
		 }
		 else 
		 {
			count1++;
		 }
		}
		System.out.println(count);
		System.out.println(count1);
	}
		
}
