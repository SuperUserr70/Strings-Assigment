
public class ReverseSentence {

	public static void main(String[] args) {

		String s1 = "Think Twice";
		String s2 = " ";
		String a[] = s1.split(" ");
		for(int i=0; i<a.length ; i++)
		{
			String s3 = " ";
			s3= s3+a[i]+" ";
			for(int j=s3.length()-1; j>=0;j--)
			{
				s2=s2+s3.charAt(j);
				
			}
		}
		System.out.println(s2.toLowerCase());

	}

}
