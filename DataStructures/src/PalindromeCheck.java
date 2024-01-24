
public class PalindromeCheck {
	public boolean isPalindrome(String word) {
		char[] charArray=word.toCharArray();
		int start =0;
		int end=word.length()-1;
		while(start<end) {
			if(charArray[start]!=charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		PalindromeCheck pc=new PalindromeCheck();
		if(pc.isPalindrome("MADAM")) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
