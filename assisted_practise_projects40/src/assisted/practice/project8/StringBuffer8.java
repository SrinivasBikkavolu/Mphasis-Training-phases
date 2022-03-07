package assisted.practice.project8;

public class StringBuffer8 
{

	public static void main(String[] args) 
	{
		String s = "Srinivas";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder(s);
		sb1.append("Veera Bhadram");
		System.out.println(sb1);


	}

}
