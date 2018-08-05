import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		ProcessAString str = new ProcessAString();
		
		System.out.println("Enter a string: ");
		String user = in.nextLine();
		
		in.close();
		
		System.out.println("The length of a string is: " + str.lengthOfAString(user));
		
		System.out.println("Characters on the even positions are: " );
	    str.characterOnTheEvenPositions(user);
		System.out.println("Characters on the odd positions are: "); 
		str.characterOnTheOddPositions(user);
		System.out.println("Total number of UPPERCASE letters: " + str.countUppercaseLetters(user));
		System.out.println("Total number of lowercase letters: " + str.countLowercaseLetters(user));
		System.out.println("Characters that are not letters are: " );
	    str.otherCharacters(user);
	

	}

}
