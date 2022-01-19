package dao;

import java.util.List;

import bean.SiswaIPS;

	public interface SiswaIPSDAO {
	public void getSiswaIPSById (int id);
	public void getSiswaIPSByNama (String nama);
	public void getSiswaIPSByEmail (String email);
	
	public List<SiswaIPS> getAllSiswaIPS();
    public void saveSiswaIPS(SiswaIPS siswaIPS);
    public void updateSiswaIPS(SiswaIPS siswaIPS);
    public void deleteSiswaIPS(SiswaIPS siswaIPS);
}
