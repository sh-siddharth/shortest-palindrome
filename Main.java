public class Main {
	public static void main(String[] args) {

		String inputStr = "";

		if (args.length == 0) {
			System.out.println("No input provided.");
			System.out.println("<usage> : java Main <string_without_space>");

			System.exit(0);
		} else {
			inputStr = args[0];
		}

		Palindrome palindrome = new Palindrome();
		System.out.println(palindrome.getShortestPanlindrome(inputStr));
	}
}
