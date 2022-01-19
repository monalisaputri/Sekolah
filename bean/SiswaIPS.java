package bean;

public class SiswaIPS extends Siswa {

	private int lamaTunggak;
	private double bayarSPP;
	private int beasiswa;
	
	public int getLamaTunggak() {
		return lamaTunggak;
	}
	public double getBayarSPP() {
		return bayarSPP;
	}
	public int getBeasiswa() {
		return beasiswa;
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
	
	public double totalSPPsetahun() {

		return bayarSPP * 12;
	}
	
	public double hitungLamaTunggak() {
		double lamaTunggak = 0;
		if (lamaTunggak >= 3 ) {
			lamaTunggak = 0.15 * bayarSPP;
		} else {
			return lamaTunggak = bayarSPP;
		}
		return lamaTunggak;
	}
	
	
	public double hitungBayaranSekolah() {
		return  totalSPPsetahun() - (beasiswa * 150000 + hitungTotalSPP());
	}
	
	@Override
	public double hitungTotalSPP() {
		// TODO Auto-generated method stub
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
}

