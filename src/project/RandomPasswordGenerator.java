package project;

import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {

	public static String generatePassword(int length) {

		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "@#$%&*!";

		Random random = new Random();
		String password = "";

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(chars.length());
			password = password + chars.charAt(index);
		}
		return password;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password Length: ");
		int length = sc.nextInt();
		String password = generatePassword(length);
		System.out.println("Generate Password: " + password);
	}
}
