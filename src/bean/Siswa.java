package bean;

abstract class Siswa {
	int id;
	String nama;
	String email;
	
	public int getId() {
		return id;
	}
	public String getNama() {
		return nama;
	}
	public String getEmail() {
		return email;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract double hitungTotalSPP();
}

