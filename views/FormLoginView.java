package views;

import java.util.Scanner;

import bean.User;
import dao.UserDAO;
import daoimp.UserDAOImpl;

public class FormLoginView {
	public static void main(String[] args) {
		menuLogin();
	}
	
	public static void menuLogin() {
		Scanner s = new Scanner(System.in);
		UserDAO operation = new UserDAOImpl();
		User user;
		String email, password;
		boolean login = false;
		
		do {
			System.out.println("\n+-------------------------------------------+");
			System.out.println("|                    LOGIN                  |");
			System.out.println("+-------------------------------------------+");
			System.out.print("| Email      : "); email = s.nextLine();
			System.out.print("| Password   : "); password = s.nextLine();
			System.out.println("+-------------------------------------------+");
			System.out.println();
			user = operation.getUserByEmailAndPassword(email, password);
			if (user != null) {
				login = true;
				MenuUtamaView.menuUtama(email);
			} else {
				System.out.println("Email atau password yang Anda masukkan salah, coba lagi...!");
			}
		} while (!login);
		s.close();
		
	}
}
