package views;

import java.util.List;
import java.util.Scanner;

import bean.SiswaIPA;
import dao.SiswaIPADAO;
import daoimp.SiswaIPADAOImpl;
import bean.SiswaIPS;
import dao.SiswaIPSDAO;
import daoimp.SiswaIPSDAOImpl;

public class TableView {
	public static void main(String[] args) {
		SiswaIPADAO operation = new SiswaIPADAOImpl();
		displayTabelSiswaIPA(operation.getAllSiswaIPA());
		
		SiswaIPADAO operation2 = new SiswaIPADAOImpl();
		displayLaporanSiswaIPA(operation2.getAllSiswaIPA());
		
		SiswaIPSDAO operation1 = new SiswaIPSDAOImpl();
		displayTabelSiswaIPS(operation1.getAllSiswaIPS());
		
		SiswaIPSDAO operation3 = new SiswaIPSDAOImpl();
		displayLaporanSiswaIPS(operation3.getAllSiswaIPS());
	}
	
	public static void displayTabelSiswaIPA(List<SiswaIPA> listSiswaIPA) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\t\t\t					  DATA SISWA IPA				     \t\t\t |");
		System.out.println("     -------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tId\t\t|\tNama\t\t\t|       Email\t\t\t|        Denda          |     Jumlah SPP         |");
		System.out.println("     -------------------------------------------------------------------------------------------------------------------------------------");
		for (SiswaIPA sIPA : listSiswaIPA) {
			System.out.println("    |\t"+sIPA.getId()+"\t|       "+sIPA.getNama()+"\t        |       "+sIPA.getEmail()+"\t|\t" +sIPA.denda()+"\t\t|\t"+sIPA.hitungTotalSPP()+"   \t |");
		}
		System.out.println("     -------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPAView.displayMenuSiswaIPA();
		}
		scanner.close();
	}
	
	public static void displayTupleSiswaIPA(SiswaIPA siswaIPA) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |		DATA PERHITUNGAN SISWA IPS				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |Id\t\t: " + siswaIPA.getId()+"\t\t\t\t|");
		System.out.println("    |Nama\t\t: " + siswaIPA.getNama()+"\t\t\t|");
		System.out.println("    |Email\t\t: " + siswaIPA.getEmail()+"\t\t|");
		System.out.println("    |Jumlah SPP\t\t: " + siswaIPA.hitungTotalSPP()+"\t\t\t\t|");
		System.out.println("     -----------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPAView.displayMenuSiswaIPA();
		}
		scanner.close();
	}
	
	
	public static void displayTabelSiswaIPS(List<SiswaIPS> listSiswaIPS) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\t\t\t					  DATA SISWA IPS				     \t\t\t |");
		System.out.println("     -------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tId\t\t|\tNama\t\t\t|       Email\t\t\t|        Denda          |     Jumlah SPP         |");
		System.out.println("     -------------------------------------------------------------------------------------------------------------------------------------");
		for (SiswaIPS sIPS : listSiswaIPS) {
			System.out.println("    |\t"+sIPS.getId()+"\t|       "+sIPS.getNama()+"\t        |       "+sIPS.getEmail()+"\t|\t" +sIPS.denda()+"\t\t|\t"+sIPS.hitungTotalSPP()+"   \t |");
		}
		System.out.println("     -------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPSView.displayMenuSiswaIPS();
		}
		scanner.close();
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
		scanner.close();
	}
	
	public static void displayLaporanSiswaIPA(List<SiswaIPA> listSiswaIPA) {
		char back;
		Scanner scanner = new Scanner(System.in);
		for (SiswaIPA sIPA : listSiswaIPA) {
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |		DATA LAPORAN SISWA IPA				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |Id \t\t: " +sIPA.getId());
		System.out.println("    |Nama\t\t: "+ sIPA.getNama());
		System.out.println("    |Email\t\t: "+ sIPA.getEmail());
		System.out.println("    |SPP\t\t: "+sIPA.getBayarSPP());
		System.out.println("    |Beasiswa\t\t: "+sIPA.getBeasiswa());
		System.out.println("    |Denda\t\t: "+sIPA.denda());
		System.out.println("    |Total SPP yang harus dibayar : "+sIPA.hitungTotalSPP());
		System.out.println("    |Total SPP (1th)\t\t  : "+sIPA.totalSPPsetahun());
		System.out.println("    |Sisa Bayaran Sekolah \t  : " +sIPA.hitungBayaranSekolah());
			//System.out.println(" " +sIPA.getId()+" "+ sIPA.getNama()+""+ sIPA.getEmail()+""+sIPA.getBayarSPP()+""+sIPA.getBeasiswa()+""+sIPA.denda()+""+sIPA.hitungTotalSPP()+""+sIPA.totalSPPsetahun()+""+sIPA.hitungBayaranSekolah()+"");
		}
		
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPAView.displayMenuSiswaIPA();
		}
		scanner.close();
	}
	
	public static void displayLaporanSiswaIPS(List<SiswaIPS> listSiswaIPS) {
		char back;
		Scanner scanner = new Scanner(System.in);
		for (SiswaIPS sIPS : listSiswaIPS) {
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |		DATA LAPORAN SISWA IPA				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |Id \t\t: " +sIPS.getId());
		System.out.println("    |Nama\t\t: "+ sIPS.getNama());
		System.out.println("    |Email\t\t: "+ sIPS.getEmail());
		System.out.println("    |SPP\t\t: "+sIPS.getBayarSPP());
		System.out.println("    |Beasiswa\t\t: "+sIPS.getBeasiswa());
		System.out.println("    |Denda\t\t: "+sIPS.denda());
		System.out.println("    |Total SPP yang harus dibayar : "+sIPS.hitungTotalSPP());
		System.out.println("    |Total SPP (1th)\t\t  : "+sIPS.totalSPPsetahun());
		System.out.println("    |Sisa Bayaran Sekolah \t  : " +sIPS.hitungBayaranSekolah());	
		}
		
		System.out.print("    | [B] Tekan Tombol B untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'B' || back == 'b') {
			SiswaIPSView.displayMenuSiswaIPS();
		}
		scanner.close();
	}
	
}
