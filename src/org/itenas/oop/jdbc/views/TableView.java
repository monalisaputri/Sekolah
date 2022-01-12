package org.itenas.oop.jdbc.views;

import java.util.List;
import java.util.Scanner;

import org.itenas.oop.jdbc.bean.SiswaIPA;
import org.itenas.oop.jdbc.dao.SiswaIPADAO;
import org.itenas.oop.jdbc.daoimpl.SiswaIPADAOImpl;
<<<<<<< HEAD
import org.itenas.oop.jdbc.bean.SiswaIPS;
import org.itenas.oop.jdbc.dao.SiswaIPSDAO;
import org.itenas.oop.jdbc.daoimpl.SiswaIPSDAOImpl;
=======
>>>>>>> 60245bfb5a15dd07ff0afee7862d1e06296cab62

public class TableView {
	public static void main(String[] args) {
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		displayTabelSiswaIPA(operation.getAllSiswaIPA());
<<<<<<< HEAD
		
		SiswaIPSDAO operation1 = new SiswaIPSDAOImpl();
		displayTabelSiswaIPS(operation1.getAllSiswaIPS());
=======
>>>>>>> 60245bfb5a15dd07ff0afee7862d1e06296cab62
	}
	
	public static void displayTabelSiswaIPA(List<SiswaIPA> listSiswaIPA) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA SISWA IPA				     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
<<<<<<< HEAD
		System.out.println("    |\tId\t\t|\tNama\t\t\t|       Email       			|       Denda      |       Jumlah SPP   |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (SiswaIPA sIPA : listSiswaIPA) {
			System.out.println("    |\t"+sIPA.getId()+"\t|       "+sIPA.getNama()+"\t        |       "+sIPA.getEmail()+"\t|\t"+sIPA.denda()+"\t        |       "+sIPA.hitungTotalSPP()+"    |");
=======
		System.out.println("    |\tNIP\t\t|\tNama\t\t\t|       Email       			|       Total SPP   |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (SiswaIPA sIPA : listSiswaIPA) {
			System.out.println("    |\t"+sIPA.getId()+"\t|       "+sIPA.getNama()+"\t        |       "+sIPA.getEmail()+"\t|\t"+sIPA.hitungTotalSPP()+"    |");
>>>>>>> 60245bfb5a15dd07ff0afee7862d1e06296cab62
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPAView.displayMenuSiswaIPA();
		}
	}
	
	public static void displayTupleSiswaIPA(SiswaIPA siswaIPA) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
<<<<<<< HEAD
		System.out.println("    |		DATA PERHITUNGAN SISWA IPA				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |Id\t\t: " + siswaIPA.getId()+"\t\t\t\t|");
		System.out.println("    |Nama\t\t: " + siswaIPA.getNama()+"\t\t\t|");
		System.out.println("    |Email\t\t: " + siswaIPA.getEmail()+"\t\t|");
		System.out.println("    |Jumlah SPP\t\t: " + siswaIPA.hitungTotalSPP()+"\t\t\t\t|");
=======
		System.out.println("    |		DATA KARYAWAN IPA				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |NIP\t\t: " + siswaIPA.getId()+"\t\t\t\t|");
		System.out.println("    |Nama\t\t: " + siswaIPA.getNama()+"\t\t\t|");
		System.out.println("    |Email\t\t: " + siswaIPA.getEmail()+"\t\t|");
		System.out.println("    |Total SPP\t\t: " + siswaIPA.hitungTotalSPP()+"\t\t\t\t|");
>>>>>>> 60245bfb5a15dd07ff0afee7862d1e06296cab62
		System.out.println("     -----------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPAView.displayMenuSiswaIPA();
		}
	}
<<<<<<< HEAD
	
	
	public static void displayTabelSiswaIPS(List<SiswaIPS> listSiswaIPS) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA SISWA IPS				     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tId\t\t|\tNama\t\t\t|       Email       			|       Jumlah SPP   |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (SiswaIPS sIPS : listSiswaIPS) {
			System.out.println("    |\t"+sIPS.getId()+"\t|       "+sIPS.getNama()+"\t        |       "+sIPS.getEmail()+"\t|\t"+sIPS.hitungTotalSPP()+"    |");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPSView.displayMenuSiswaIPS();
		}
	}
	
	public static void displayTupleSiswaIPS(SiswaIPS siswaIPS) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |		DATA PERHITUNGAN SISWA IPS				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |Id\t\t: " + siswaIPS.getId()+"\t\t\t\t|");
		System.out.println("    |Nama\t\t: " + siswaIPS.getNama()+"\t\t\t|");
		System.out.println("    |Email\t\t: " + siswaIPS.getEmail()+"\t\t|");
		System.out.println("    |Jumlah SPP\t\t: " + siswaIPS.hitungTotalSPP()+"\t\t\t\t|");
		System.out.println("     -----------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPSView.displayMenuSiswaIPS();
		}
	}
=======
>>>>>>> 60245bfb5a15dd07ff0afee7862d1e06296cab62
}
