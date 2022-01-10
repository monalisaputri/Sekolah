package org.itenas.oop.jdbc.dao;

import java.util.List;

import org.itenas.oop.jdbc.bean.SiswaIPA;

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
