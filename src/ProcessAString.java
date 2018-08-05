class ProcessAString {

	String str;

	public ProcessAString() {

	}

	public ProcessAString(String str) {
		this.str = str;

	}

	/*
	 * Method returns the length of a string. Do not count whitespace as character.
	 * Letters are all character from a to z and from A to Z.
	 */
	public int lengthOfAString(String str) {

		int length = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isWhitespace(str.charAt(i)))
				continue;

			else
				length++;
		}

		return length;
	}

	/*
	 * This method displays all characters on the even positions. Do not count whitespace as
	 * character. Letters are all character from a to z and from A to Z.
	 */
	public void characterOnTheEvenPositions(String str) {

	}

	/*
	 * This method displays all character on the odd positions Do not count whitespace as
	 * character. Letters are all character from a to z and from A to Z.
	 */

	public void characterOnTheOddPositions(String str) {

	}

	/*
	 * This method returns total count of all upper case letters.
	 */

	public int countUppercaseLetters(String str) {

		int count = 0;
		
		
		return count;
	}

	/*
	 * This method returns total count of all lower case letters.
	 */
	public int countLowercaseLetters(String str) {
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i)))
				count++;
		}
		
		
		return count;

	}

	/*
	 * display all characters that are not letters Do not count whitespace as
	 * character. Letters are all character from a to z and from A to Z.
	 */

	public void otherCharacters(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			if(!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				System.out.print(str.charAt(i) + " ");
				
			}
			else
				continue;
		}

	}

}
