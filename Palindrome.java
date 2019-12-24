public class Palindrome {
	
	public String getShortestPanlindrome(String input) {	
		
		String revInput = new StringBuilder(input).reverse().toString();
		
		String firstPalindrome = getFirstLongestPalindrome(input);
		String lastPalindrome = getFirstLongestPalindrome(revInput);

		if(firstPalindrome.length() > lastPalindrome.length()) {
			return makePalindrome(input, firstPalindrome);
		}
		
		return makePalindrome(revInput, lastPalindrome);
	}
	
	private String makePalindrome(String input, String str) {
		String remainingChars = new StringBuilder(input.substring(str.length())).reverse().toString();
		return remainingChars + input;
	}
	
	private String getFirstLongestPalindrome(String str) {
		String temp = "";
		String longest = "";
		
		for(int i=0; i<str.length() ; i++) {			
			temp += String.valueOf(str.charAt(i));			
			if(checkPalindrome(temp) && temp.length() > longest.length()) {
				longest = temp;
			}
		}
		
		return longest;
	}

	private Boolean checkPalindrome(String str) {		
		
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
		
		return true;
	}
}
