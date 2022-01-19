package views;

import java.util.Scanner;

import dao.SiswaIPSDAO;
import daoimp.SiswaIPSDAOImpl;

public class SiswaIPSView {
	public SiswaIPSView () {
	}
	
	public static void displayMenuSiswaIPS() {
		int menu;
		Scanner scanner = new Scanner(System.in);
		SiswaIPSDAO operation = new SiswaIPSDAOImpl();
		System.out.println();			        
        System.out.println("              *******************************************                  ");
        System.out.println("              |            Data Siswa IPS               |                  ");
        System.out.println("              *******************************************                  ");
        System.out.println("              | Pilihan:                              	|                  ");
        System.out.println("              |        1. Input Data		        |  				   ");
        System.out.println("              |        2. Cari Data                 	|                  ");
        System.out.println("              |        3. Tampilkan Seluruh Data      	|                  ");
        System.out.println("              |        4. Perbarui Data               	|                  ");
        System.out.println("              |        5. Hapus Data                  	|                  ");
        System.out.println("              |        6. Laporan                      	|                  ");
        System.out.println("              |        7. Logout                      	|                  ");
        System.out.println("              *******************************************                  ");	
        System.out.println();
        System.out.print("Pilih menu: ");
        menu = scanner.nextInt();
        
        while (!(menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6 || menu == 7)) {
        	System.out.println("Warning: Menu yang Anda masukkan salah!");
        	System.out.print("Silahkan pilih menu kembali: ");
        	menu = scanner.nextInt();
        }
        
        switch (menu) {
	        case 1:
	        	FormView.formInsertSiswaIPS();
	        	break;
	        case 2:
	        	int ch;
	        	Scanner s = new Scanner(System.in);
	        	System.out.println("|========= Menu Cari Data Siswa ========|");
	        	System.out.println("|Pilihan:				|");
	        	System.out.println("|         1. Cari Data Siswa by email   |");
	        	System.out.println("|         2. Cari Data Siswa by id      |");
	        	System.out.println("|         3. Cari Data Siswa by nama    |");
	        	System.out.println("|=======================================|");
	        	System.out.print("Pilih menu: ");
	        	ch = s.nextInt();
	        	if(ch == 1) {
	        		FormView.formSearchSiswaIPSByEmail();
	        	}else if(ch == 2) {
	        		FormView.formSearchSiswaIPSById();
	        	}else if(ch == 3) {
	        		FormView.formSearchSiswaIPSByNama();
	        	}
	        	break;
	        case 3:
	        	TableView.displayTabelSiswaIPS(operation.getAllSiswaIPS());
	        	break;
	        case 4:
	        	FormView.formUpdateSiswaIPS();
	        	break;
	        case 5:
	        	FormView.formDeleteSiswaIPS();
	        	break;
	        case 6:
	        	TableView.displayLaporanSiswaIPS(operation.getAllSiswaIPS());
	        	break;
	        case 7:
	        	FormLoginView.menuLogin();
	        	break;
	        default:
	        	System.out.println("Warning: Pilihan yang anda masukkan salah!");  	
        }
        
        scanner.close();
	}
}
