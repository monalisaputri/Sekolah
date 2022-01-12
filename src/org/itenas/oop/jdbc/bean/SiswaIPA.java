package org.itenas.oop.jdbc.bean;

public class SiswaIPA extends Siswa{
	private int lamaTunggak;
	private double bayarSPP;
	private int beasiswa;
	private double totalSPP;
	
	public int getLamaTunggak() {
		return lamaTunggak;
	}
	public double getBayarSPP() {
		return bayarSPP;
	}
	public int getBeasiswa() {
		return beasiswa;
	}
	public double getTotalSPP() {
		return totalSPP;
	}
	public void setLamaTunggak(int lamaTunggak) {
		this.lamaTunggak = lamaTunggak;
	}
	public void setBayarSPP(double bayarSPP) {
		this.bayarSPP = bayarSPP;
	}
	public void setBeasiswa(int beasiswa) {
		this.beasiswa = beasiswa;
	}
	public void setTotalSPP(double totalSPP) {
		this.totalSPP = totalSPP;
	}
	
	public double hitungLamaTunggak() {
		double lamaTunggak = 0;
<<<<<<< HEAD

		return lamaTunggak = bayarSPP;
=======
		if (lamaTunggak >= 3 ) {
			lamaTunggak = 0.15 * bayarSPP;
		} else {
			lamaTunggak = bayarSPP;
		}
		return lamaTunggak;
>>>>>>> 60245bfb5a15dd07ff0afee7862d1e06296cab62
	}
	
	
	public double hitungBayaranSekolah() {
		return beasiswa * 150000;
	}
	
	@Override
	public double hitungTotalSPP() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return bayarSPP + hitungLamaTunggak() + denda();
	}
	
	public double denda() {
		double denda = 0;
		if (lamaTunggak >= 3 ) {
			denda = (0.15 * bayarSPP);
		} else {
			denda = 0;
		}
		return denda;
	}
=======
		return bayarSPP + hitungLamaTunggak();
	}
	
>>>>>>> 60245bfb5a15dd07ff0afee7862d1e06296cab62
	
}
