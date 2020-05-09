import java.util.Scanner;

public class StaticCharacterMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a character and press Enter");
		String input = scanner.next();
		char c = input.charAt(0);
		
		System.out.printf("isDefined: %b%n", Character.isDefined(c));
		System.out.printf("isDigit: %b%n", Character.isDigit(c));
		System.out.printf("isJavaIdentifierStart: %b%n", Character.isJavaIdentifierStart(c));
		System.out.printf("isJavaIdentifierPart: %b%n", Character.isJavaIdentifierPart(c));
		System.out.printf("isLetter: %b%n", Character.isLetter(c));
		System.out.printf("isLetterOrDigit: %b%n", Character.isLetterOrDigit(c));
		System.out.printf("isLowerCase: %b%n", Character.isLowerCase(c));
		System.out.printf("isUpperCase: %b%n", Character.isUpperCase(c));
		System.out.printf("toUpperCase: %b%n", Character.toUpperCase(c));
		System.out.printf("isUpperCase: %b%n", Character.isUpperCase(c));

	}

}
