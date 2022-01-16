package dao;

import java.util.List;

import bean.SiswaIPS;

	public interface SiswaIPSDAO {
	public SiswaIPS getSiswaIPSById (int id);
	public SiswaIPS getSiswaIPSByNama (String nama);
	public void getSiswaIPSByEmail (String email);
	public String getNamaById(int id);
	
	public List<SiswaIPS> getAllSiswaIPS();
    public void saveSiswaIPS(SiswaIPS siswaIPS);
    public void updateSiswaIPS(SiswaIPS siswaIPS);
    public void deleteSiswaIPS(SiswaIPS siswaIPS);
}
