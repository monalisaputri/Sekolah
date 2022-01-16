package daoimp;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bean.SiswaIPA;
import dao.SiswaIPADAO;
import utils.DatabaseUtil;
import views.TableView;

public class SiswaIPADAOImpl implements SiswaIPADAO{

	@Override
	public SiswaIPA getSiswaIPAById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SiswaIPA getSiswaIPAByNama(String nama) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getSiswaIPAByEmail(String email) {
		// TODO Auto-generated method stub
		DatabaseUtil db = new DatabaseUtil();
		SiswaIPA siswaIPA = new SiswaIPA();
		try {
			db.connect();
            String query = "SELECT * FROM siswaIPA WHERE email = '"+email+"'";
            ResultSet rs = db.readData(query);
 
            // process query results
            if (rs.next()) {
 
                ResultSetMetaData metaData = rs.getMetaData();
                int jumlahKolom = metaData.getColumnCount();
                do {
                    for (int i = 1; i <= jumlahKolom; i++) {
                    	siswaIPA.setId(Integer.parseInt(rs.getObject(1).toString()));
                    	siswaIPA.setNama(rs.getObject(2).toString());
                    	siswaIPA.setEmail(rs.getObject(3).toString());
                        siswaIPA.setLamaTunggak(Integer.parseInt(rs.getObject(4).toString()));
                        siswaIPA.setBayarSPP(Double.parseDouble(rs.getObject(5).toString()));
                        siswaIPA.setBeasiswa(Integer.parseInt(rs.getObject(6).toString()));
                    }
                } while (rs.next());
                
            } else {
            	siswaIPA.setId(0);
            }

            //close db connection
            db.disconnect();            
 
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
		
		TableView.displayTupleSiswaIPA(siswaIPA);
	}

	@Override
	public String getNamaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SiswaIPA> getAllSiswaIPA() {
		// TODO Auto-generated method stub
		List<SiswaIPA> listSiswaIPA = new ArrayList<SiswaIPA>();
		DatabaseUtil db = new DatabaseUtil();
		try {
			db.connect();
			 
            String query = "SELECT * FROM siswaIPA";
         
            ResultSet rs = db.readData(query);
 
            // process query results
            while (rs.next()) {
 
            	SiswaIPA siswaIPA = new SiswaIPA();
            	
            	siswaIPA.setId(Integer.parseInt(rs.getObject(1).toString()));
            	siswaIPA.setNama(rs.getObject(2).toString());
            	siswaIPA.setEmail(rs.getObject(3).toString());
            	siswaIPA.setLamaTunggak(Integer.parseInt(rs.getObject(4).toString()));
            	siswaIPA.setBayarSPP(Double.parseDouble(rs.getObject(5).toString()));
            	siswaIPA.setBeasiswa(Integer.parseInt(rs.getObject(6).toString()));
                
                listSiswaIPA.add(siswaIPA);
 
            } 
            //close db connection
            db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
		return listSiswaIPA;
	}

	@Override
	public void saveSiswaIPA(SiswaIPA siswaIPA) {
		// TODO Auto-generated method stub
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "INSERT INTO siswaIPA (id, nama, email, lama_tunggak, bayar_spp,beasiswa, total_spp)"
					+ " VALUES ("+siswaIPA.getId()+", '"
					+ siswaIPA.getNama()+"', '"
					+ siswaIPA.getEmail()+"', "
					+ siswaIPA.getLamaTunggak()+", "
					+ siswaIPA.getBayarSPP()+", "
					+ siswaIPA.getBeasiswa()+", "
					+ siswaIPA.hitungTotalSPP()+")";
				db.executeQuery(query);
				System.out.println("Data berhasil ditambahkan!");
			} catch (Exception ex) {
				System.out.println("Terjadi error: " + ex.getMessage());
			}
	}

	@Override
	public void updateSiswaIPA(SiswaIPA siswaIPA) {
		// TODO Auto-generated method stub
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "UPDATE siswaIPA SET nama='"+siswaIPA.getNama()+"',"
					+ " email='"+siswaIPA.getEmail()+"',"
					+ " lama_tunggak="+siswaIPA.getLamaTunggak()+","
					+ " bayar_spp="+siswaIPA.getBayarSPP()+","
					+ " beasiswa="+siswaIPA.getBeasiswa()+","
					+ " total_spp="+siswaIPA.hitungTotalSPP()+" WHERE id='"+siswaIPA.getId()+"'";
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui!");
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
	}

	@Override
	public void deleteSiswaIPA(SiswaIPA siswaIPA) {
		// TODO Auto-generated method stub
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "DELETE FROM siswaIPA WHERE id='"+siswaIPA.getId()+"'";
			db.executeQuery(query);
			TableView.displayTabelSiswaIPA(getAllSiswaIPA());
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
	}

}
