package views;

import java.util.Scanner;

import dao.SiswaIPADAO;
import daoimp.SiswaIPADAOImpl;

public class SiswaIPAView {
	public SiswaIPAView () {
	}
	
	public static void displayMenuSiswaIPA() {
		int menu;
		Scanner scanner = new Scanner(System.in);
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		System.out.println();			        
        System.out.println("              *******************************************                  ");
        System.out.println("              |            Data Siswa IPA        		|                  ");
        System.out.println("              *******************************************                  ");
        System.out.println("              | Pilihan:                              	|                  ");
        System.out.println("              |        1. Input Data		     		|  				   ");
        System.out.println("              |        2. Cari Data By Email          	|                  ");
        System.out.println("              |        3. Tampilkan Seluruh Data      	|                  ");
        System.out.println("              |        4. Perbarui Data               	|                  ");
        System.out.println("              |        5. Hapus Data                  	|                  ");
        System.out.println("              |        6. Laporan                      	|                  ");
        System.out.println("              |        7. Logout                      	|                  ");
        System.out.println("              *******************************************                  ");	
        System.out.println();
        System.out.print("Pilih menu: ");
        menu = scanner.nextInt();
        
        while (!(menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6)) {
        	System.out.println("Warning: Menu yang Anda masukkan salah!");
        	System.out.print("Silahkan pilih menu kembali: ");
        	menu = scanner.nextInt();
        }
        
        switch (menu) {
	        case 1:
	        	FormView.formInsertSiswaIPA();
	        	break;
	        case 2:
	        	FormView.formSearchSiswaIPAByEmail();
	        	break;
	        case 3:
	        	TableView.displayTabelSiswaIPA(operation.getAllSiswaIPA());
	        	break;
	        case 4:
	        	FormView.formUpdateSiswaIPA();
	        	break;
	        case 5:
	        	FormView.formDeleteSiswaIPA();
	        	break;
	        case 6:
	        	TableView.displayLaporanSiswaIPA(operation.getAllSiswaIPA());
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
