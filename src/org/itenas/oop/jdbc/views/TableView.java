package org.itenas.oop.jdbc.views;

import java.util.List;
import java.util.Scanner;

import org.itenas.oop.jdbc.bean.SiswaIPA;
import org.itenas.oop.jdbc.dao.SiswaIPADAO;
import org.itenas.oop.jdbc.daoimpl.SiswaIPADAOImpl;

public class TableView {
	public static void main(String[] args) {
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		displayTabelSiswaIPA(operation.getAllSiswaIPA());
	}
	
	public static void displayTabelSiswaIPA(List<SiswaIPA> listSiswaIPA) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA SISWA IPA				     |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tNIP\t\t|\tNama\t\t\t|       Email       			|       Total SPP   |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (SiswaIPA sIPA : listSiswaIPA) {
			System.out.println("    |\t"+sIPA.getId()+"\t|       "+sIPA.getNama()+"\t        |       "+sIPA.getEmail()+"\t|\t"+sIPA.hitungTotalSPP()+"    |");
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
		System.out.println("    |		DATA KARYAWAN IPA				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |NIP\t\t: " + siswaIPA.getId()+"\t\t\t\t|");
		System.out.println("    |Nama\t\t: " + siswaIPA.getNama()+"\t\t\t|");
		System.out.println("    |Email\t\t: " + siswaIPA.getEmail()+"\t\t|");
		System.out.println("    |Total SPP\t\t: " + siswaIPA.hitungTotalSPP()+"\t\t\t\t|");
		System.out.println("     -----------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPAView.displayMenuSiswaIPA();
		}
	}
}
