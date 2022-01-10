package org.itenas.oop.jdbc.views;

import java.util.Scanner;

import org.itenas.oop.jdbc.bean.SiswaIPA;
import org.itenas.oop.jdbc.dao.SiswaIPADAO;
import org.itenas.oop.jdbc.daoimpl.SiswaIPADAOImpl;

public class FormView {
	public static void formInsertSiswaIPA() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		char back;
		SiswaIPA siswaIPA = new SiswaIPA();
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		System.out.println("      	*****************************************		");
        System.out.println("			| Form Insert Data Siswa IPA       	|		");
        System.out.println("              	*****************************************               ");
        System.out.print("                	| ID							:");
        siswaIPA.setId(scanner.nextInt());
        System.out.print("               	| Nama		        				:");
        siswaIPA.setNama(scanner2.nextLine());
        System.out.print("             	 	| Email                   				:");
        siswaIPA.setEmail(scanner2.nextLine());
        System.out.print("              	| Lama Tunggak           				:");
        siswaIPA.setLamaTunggak(scanner2.nextInt());
        System.out.print("              	| Uang SPP              				:");
        siswaIPA.setBayarSPP(scanner2.nextDouble());
        System.out.print("              	| Beasiswa       					:");
        siswaIPA.setBeasiswa(scanner2.nextInt());
        System.out.println("              	*****************************************		");
        operation.saveSiswaIPA(siswaIPA);
        System.out.print("[B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner2.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPAView.displayMenuSiswaIPA();
		}
	}
	
	public static void formUpdateSiswaIPA() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int id;
		char back;
		SiswaIPA siswaIPA = new SiswaIPA();
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		System.out.print("Masukkan ID dari data yang akan diupdate: ");
		id = scanner.nextInt();
		System.out.println();
		System.out.println("		*****************************************		");
        System.out.println("              	| Form Update Data Siswa IPA       |     		");
        System.out.println("              	*****************************************		");
        System.out.print("              	| ID							:");
        System.out.println(id);
        siswaIPA.setId(id);
        System.out.print("              	| Nama		        				:");
        siswaIPA.setNama(scanner2.nextLine());
        System.out.print("              	| Email                   				:");
        siswaIPA.setEmail(scanner2.nextLine());
        System.out.print("              	| Lama Tunggak            				:");
        siswaIPA.setLamaTunggak(scanner2.nextInt());
        System.out.print("              	| Gaji Tetap              				:");
        siswaIPA.setBayarSPP(scanner2.nextDouble());
        System.out.print("              	| Beasiswa      					:");
        siswaIPA.setBeasiswa(scanner2.nextInt());
        System.out.println("              	****************************************		");
        operation.updateSiswaIPA(siswaIPA);;
        System.out.print("[B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner2.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPAView.displayMenuSiswaIPA();
		}
	}
	
	public static void formDeleteSiswaIPA() {
		Scanner scanner = new Scanner(System.in);
		int id;
		SiswaIPA siswaIPA = new SiswaIPA();
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		System.out.print("Masukkan ID dari data yang akan dihapus: ");
		id = scanner.nextInt();
		siswaIPA.setId(id);
		operation.deleteSiswaIPA(siswaIPA);	
	}
	
	public static void SiswaIPA() {
		Scanner scanner = new Scanner(System.in);
		String email;
		SiswaIPA siswaIPA = new SiswaIPA();
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		System.out.print("Masukkan email dari data yang akan dicari: ");
		email = scanner.nextLine();
		siswaIPA.setEmail(email);
		operation.getSiswaIPAByEmail(email);	
	}
	
	public static void formSearchSiswaIPAByEmail() {
		Scanner scanner = new Scanner(System.in);
		String email;
		SiswaIPA siswaIPA = new SiswaIPA();
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		System.out.print("Masukkan email dari data yang akan dicari: ");
		email = scanner.nextLine();
		siswaIPA.setEmail(email);
		operation.getSiswaIPAByEmail(email);	
	}
}
