
public class PanagramProgram {

	public static void main(String[] args) {
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      boolean[] alphaList = new boolean[26];
	      int index = 0;
	      int flag = 1;
	      str = str.toLowerCase();
	      for (int i = 0; i < str.length(); i++) {
	         if ( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
	            index = str.charAt(i) - 'a';
	         }
	      alphaList[index] = true;
	   }
	   for (int i = 0; i <= 25; i++) {
	      if (alphaList[i] == false)
	      flag = 0;
	   }
	   System.out.print("String: " + str);
	   if (flag == 1)
	      System.out.print("\nThe above string is a pangram.");
	   else
	      System.out.print("\nThe above string is not a pangram.");

	}

}
