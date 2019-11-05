package generic_methods;

public class reversestring_gen
{
 public void revers(String value)
 {String s2="";
	 String copy=value;
	 for (int i = value.length()-1; i >=0; i--) 
	{
	s2 = s2+value.charAt(i);	
	}
	 if (copy.equals(s2)) 
	{
		System.out.println("palendrom");
	}
 }
}
