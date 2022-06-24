package test;

import midtermexam_versiona_extensioncode.*;
import java.util.Scanner;

/**
	@author chieur (Ricky Chieu), 991625137
*/
public class TestUserprofile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("input ID:");
		String userID = scanner.nextLine();

		System.out.println("\ngenres:");
		Genre[] arrayGenres = Genre.values();
		for (int i = 0, lengthArrayGenres = arrayGenres.length; i < lengthArrayGenres; i++) {
			System.out.println((i + 1) + ".\t" + arrayGenres[i].get_name());
		}
		System.out.println("\ninput enum of favorite genre:");
		Genre genre = arrayGenres[scanner.nextInt() - 1];

		UserProfile userProfile = new UserProfile(userID,genre);
		System.out.println("\nuserProfile is created\ngenre: " + genre.get_name());
	}
}