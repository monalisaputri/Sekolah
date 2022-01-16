package dao;

import java.util.List;

import bean.SiswaIPA;

public interface SiswaIPADAO {
	public SiswaIPA getSiswaIPAById (int id);
	public SiswaIPA getSiswaIPAByNama (String nama);
	public void getSiswaIPAByEmail (String email);
	public String getNamaById(int id);
	
	public List<SiswaIPA> getAllSiswaIPA();
    public void saveSiswaIPA(SiswaIPA siswaIPA);
    public void updateSiswaIPA(SiswaIPA siswaIPA);
    public void deleteSiswaIPA(SiswaIPA siswaIPA);
}
