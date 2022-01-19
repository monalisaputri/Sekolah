package views;

import java.util.Scanner;

import bean.SiswaIPA;
import dao.SiswaIPADAO;
import daoimp.SiswaIPADAOImpl;
import bean.SiswaIPS;
import dao.SiswaIPSDAO;
import daoimp.SiswaIPSDAOImpl;

public class FormView {
	public static void formInsertSiswaIPA() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		char back;
		SiswaIPA siswaIPA = new SiswaIPA();
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		System.out.println("              *****************************************                  ");
        System.out.println("              |      Form Insert Data Siswa IPA       |                  ");
        System.out.println("              *****************************************                  ");
        System.out.print("              | ID			:");
        siswaIPA.setId(scanner.nextInt());
        System.out.print("              | Nama		        :");
        siswaIPA.setNama(scanner2.nextLine());
        System.out.print("              | Email                   :");
        siswaIPA.setEmail(scanner2.nextLine());
        System.out.print("              | Lama Tunggak            :");
        siswaIPA.setLamaTunggak(scanner2.nextInt());
        System.out.print("              | Uang SPP                :");
        siswaIPA.setBayarSPP(scanner2.nextDouble());
        System.out.print("              | Beasiswa                :");
        siswaIPA.setBeasiswa(scanner2.nextInt());
        System.out.println("              *****************************************					 ");
        operation.saveSiswaIPA(siswaIPA);
        System.out.print("[B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner2.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPAView.displayMenuSiswaIPA();
		}
		scanner.close();
		scanner2.close();
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
		System.out.println("              *****************************************                  ");
        System.out.println("              |      Form Update Data Siswa IPA       |                  ");
        System.out.println("              *****************************************                  ");
        System.out.print("              | ID			:");
        System.out.println(id);
        siswaIPA.setId(id);
        System.out.print("              | Nama		        :");
        siswaIPA.setNama(scanner2.nextLine());
        System.out.print("              | Email                   :");
        siswaIPA.setEmail(scanner2.nextLine());
        System.out.print("              | Lama Tunggak            :");
        siswaIPA.setLamaTunggak(scanner2.nextInt());
        System.out.print("              | Bayar_spp               :");
        siswaIPA.setBayarSPP(scanner2.nextDouble());
        System.out.print("              | Beasiswa\t\t :");
        siswaIPA.setBeasiswa(scanner2.nextInt());
        operation.updateSiswaIPA(siswaIPA);;
        System.out.print("[B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner2.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPAView.displayMenuSiswaIPA();
		}
		scanner.close();
		scanner2.close();
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
		scanner.close();
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
		scanner.close();
	}
	
	public static void formSearchSiswaIPAById() {
		Scanner scanner = new Scanner(System.in);
		int id;
		SiswaIPA siswaIPA = new SiswaIPA();
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		System.out.print("Masukkan id dari data yang akan dicari: ");
		id = scanner.nextInt();
		siswaIPA.setId(id);
		operation.getSiswaIPAById(id);
		scanner.close();
	}
	
	public static void formSearchSiswaIPAByNama() {
		Scanner scanner = new Scanner(System.in);
		String nama;
		SiswaIPA siswaIPA = new SiswaIPA();
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		System.out.print("Masukkan nama dari data yang akan dicari: ");
		nama = scanner.nextLine();
		siswaIPA.setNama(nama);
		operation.getSiswaIPAByNama(nama);
		scanner.close();
	}
		
	public static void formInsertSiswaIPS() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		char back;
		SiswaIPS siswaIPS = new SiswaIPS();
		SiswaIPSDAO operation = new SiswaIPSDAOImpl();
		System.out.println("              *****************************************                  ");
        System.out.println("              |      Form Insert Data Siswa IPS       |                  ");
        System.out.println("              *****************************************                  ");
        System.out.print("              | ID			:");
        siswaIPS.setId(scanner.nextInt());
        System.out.print("              | Nama		        :");
        siswaIPS.setNama(scanner2.nextLine());
        System.out.print("              | Email                   :");
        siswaIPS.setEmail(scanner2.nextLine());
        System.out.print("              | Lama Tunggak            :");
        siswaIPS.setLamaTunggak(scanner2.nextInt());
        System.out.print("              | Uang SPP                :");
        siswaIPS.setBayarSPP(scanner2.nextDouble());
        System.out.print("              | Beasiswa                :");
        siswaIPS.setBeasiswa(scanner2.nextInt());
        System.out.println("              *****************************************					 ");
        operation.saveSiswaIPS(siswaIPS);
        System.out.print("[B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner2.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPSView.displayMenuSiswaIPS();
		}
		scanner.close();
		scanner2.close();
	}
	
	public static void formUpdateSiswaIPS() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int id;
		char back;
		SiswaIPS siswaIPS = new SiswaIPS();
		SiswaIPSDAO operation = new SiswaIPSDAOImpl();
		System.out.print("Masukkan ID dari data yang akan diupdate: ");
		id = scanner.nextInt();
		System.out.println();
		System.out.println("              *****************************************                  ");
        System.out.println("              |      Form Update Data Siswa IPS       |                  ");
        System.out.println("              *****************************************                  ");
        System.out.print("              | ID			:");
        System.out.println(id);
        siswaIPS.setId(id);
        System.out.print("              | Nama		        :");
        siswaIPS.setNama(scanner2.nextLine());
        System.out.print("              | Email                   :");
        siswaIPS.setEmail(scanner2.nextLine());
        System.out.print("              | Lama Tunggak            :");
        siswaIPS.setLamaTunggak(scanner2.nextInt());
        System.out.print("              | Bayar_spp               :");
        siswaIPS.setBayarSPP(scanner2.nextDouble());
        System.out.print("              | Beasiswa\t\t :");
        siswaIPS.setBeasiswa(scanner2.nextInt());
        System.out.println("              *****************************************					 ");
        operation.updateSiswaIPS(siswaIPS);;
        System.out.print("[B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner2.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPSView.displayMenuSiswaIPS();
		}
		scanner.close();
		scanner2.close();
	}
	
	public static void formDeleteSiswaIPS() {
		Scanner scanner = new Scanner(System.in);
		int id;
		SiswaIPS siswaIPS = new SiswaIPS();
		SiswaIPSDAO operation1 = new SiswaIPSDAOImpl();
		System.out.print("Masukkan ID dari data yang akan dihapus: ");
		id = scanner.nextInt();
		siswaIPS.setId(id);
		operation1.deleteSiswaIPS(siswaIPS);	
		scanner.close();
	}
	
	public static void formSearchSiswaIPSByEmail() {
		Scanner scanner = new Scanner(System.in);
		String email;
		SiswaIPS siswaIPS = new SiswaIPS();
		SiswaIPSDAO operation1 = new SiswaIPSDAOImpl();
		System.out.print("Masukkan email dari data yang akan dicari: ");
		email = scanner.nextLine();
		siswaIPS.setEmail(email);
		operation1.getSiswaIPSByEmail(email);
		scanner.close();
	}
	
	public static void formSearchSiswaIPSById() {
		Scanner scanner = new Scanner(System.in);
		int id;
		SiswaIPS siswaIPS = new SiswaIPS();
		SiswaIPSDAO operation = new SiswaIPSDAOImpl();
		System.out.print("Masukkan id dari data yang akan dicari: ");
		id = scanner.nextInt();
		siswaIPS.setId(id);
		operation.getSiswaIPSById(id);
		scanner.close();
	}
	
	public static void formSearchSiswaIPSByNama() {
		Scanner scanner = new Scanner(System.in);
		String nama;
		SiswaIPS siswaIPS = new SiswaIPS();
		SiswaIPSDAO operation = new SiswaIPSDAOImpl();
		System.out.print("Masukkan nama dari data yang akan dicari: ");
		nama = scanner.nextLine();
		siswaIPS.setNama(nama);
		operation.getSiswaIPSByNama(nama);
		scanner.close();
	}
}
