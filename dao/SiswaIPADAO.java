package dao;

import java.util.List;

import bean.SiswaIPA;

public interface SiswaIPADAO {
	public void getSiswaIPAById (int id);
	public void getSiswaIPAByNama (String nama);
	public void getSiswaIPAByEmail (String email);
	
	public List<SiswaIPA> getAllSiswaIPA();
    public void saveSiswaIPA(SiswaIPA siswaIPA);
    public void updateSiswaIPA(SiswaIPA siswaIPA);
    public void deleteSiswaIPA(SiswaIPA siswaIPA);
}
