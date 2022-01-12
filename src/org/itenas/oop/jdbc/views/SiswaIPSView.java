package org.itenas.oop.jdbc.views;

import java.util.Scanner;

import org.itenas.oop.jdbc.dao.SiswaIPSDAO;
import org.itenas.oop.jdbc.daoimpl.SiswaIPSDAOImpl;

public class SiswaIPSView {
	public SiswaIPSView () {
	}
	
	public static void displayMenuSiswaIPS() {
		int menu;
		Scanner scanner = new Scanner(System.in);
		SiswaIPSDAO operation = new SiswaIPSDAOImpl();
		System.out.println();			        
        System.out.println("              *******************************************                  ");
        System.out.println("              |            Data Siswa IPS        		|                  ");
        System.out.println("              *******************************************                  ");
        System.out.println("              | Pilihan:                              	|                  ");
        System.out.println("              |        1. Input Data		     		|  				   ");
        System.out.println("              |        2. Cari Data By Email          	|                  ");
        System.out.println("              |        3. Tampilkan Seluruh Data      	|                  ");
        System.out.println("              |        4. Perbarui Data               	|                  ");
        System.out.println("              |        5. Hapus Data                  	|                  ");
        System.out.println("              |        6. Logout                      	|                  ");
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
	        	FormView.formInsertSiswaIPS();
	        	break;
	        case 2:
	        	FormView.formSearchSiswaIPSByEmail();
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
	        	FormLoginView.menuLogin();
	        	break;
	        default:
	        	System.out.println("Warning: Pilihan yang anda masukkan salah!");  	
        }
        
        scanner.close();
	}
}
