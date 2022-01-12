package org.itenas.oop.jdbc.views;

import java.util.Scanner;

public class MenuUtamaView {
	public static void menuUtama(String email) {
		int menu;
		Scanner mainScanner = new Scanner(System.in);
        System.out.println();		        
        System.out.println("              *******************************************                  ");
        System.out.println("              |      Selamat Datang Di Menu Utama     	|                  ");
        System.out.println("              *******************************************                  ");
        System.out.println("              | Hello... " + email	+ "  |				 				   ");
        System.out.println("              | Pilihan:                              	|                  ");
        System.out.println("              |        1. Data Siswa IPA         		|                  ");
        System.out.println("              |        2. Data Siswa IPS      			|                  ");
        System.out.println("              |        3. Keluar Aplikasi             	|                  ");
        System.out.println("              *******************************************                  ");	
        System.out.println();
        System.out.print("Pilih menu: ");
        menu = mainScanner.nextInt();
        
        while (!(menu == 1 || menu == 2 || menu == 3)) {
        	System.out.println("Warning: Menu yang Anda masukkan salah!");
        	System.out.println();
        	System.out.print("Silahkan pilih menu kembali: ");
        	menu = mainScanner.nextInt();
        }
        
        switch (menu) {
	        case 1:
	        	SiswaIPAView.displayMenuSiswaIPA();;
	        	break;
	        case 2:
<<<<<<< HEAD
	        	SiswaIPSView.displayMenuSiswaIPS();;
=======
	        	System.out.println("Anda memilih menu 2");
>>>>>>> 60245bfb5a15dd07ff0afee7862d1e06296cab62
	        	break;
	        case 3:
	        	System.out.println("Terima kasih, Anda keluar dari aplikasi!");
	        	System.exit(0);
	        default:
	        	System.out.println("Warning: Pilihan yang anda masukkan salah!");  	
        }
        
        mainScanner.close();
	}

}
