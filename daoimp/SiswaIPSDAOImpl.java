package daoimp;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.SiswaIPS;
import dao.SiswaIPSDAO;
import utils.DatabaseUtil;
import views.TableView;

public class SiswaIPSDAOImpl implements SiswaIPSDAO{
	@Override
	public void getSiswaIPSById(int id) {
		// TODO Auto-generated method stub
		DatabaseUtil db = new DatabaseUtil();
		SiswaIPS siswaIPS = new SiswaIPS();
		try {
			db.connect();
 
            String query = "SELECT * FROM siswaIPS WHERE id = '"+id+"'";
            ResultSet rs = db.readData(query);
 
            // process query results
            if (rs.next()) {
 
                ResultSetMetaData metaData = rs.getMetaData();
                int jumlahKolom = metaData.getColumnCount();
                do {
                    for (int i = 1; i <= jumlahKolom; i++) {
                    	siswaIPS.setId(Integer.parseInt(rs.getObject(1).toString()));
                    	siswaIPS.setNama(rs.getObject(2).toString());
                    	siswaIPS.setEmail(rs.getObject(3).toString());
                        siswaIPS.setLamaTunggak(Integer.parseInt(rs.getObject(4).toString()));
                        siswaIPS.setBayarSPP(Double.parseDouble(rs.getObject(5).toString()));
                        siswaIPS.setBeasiswa(Integer.parseInt(rs.getObject(6).toString()));
                    }
                } while (rs.next());
                
            } else {
            	siswaIPS.setId(0);
            }

            //close db connection
            db.disconnect();            
 
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
		
		TableView.displayTupleSiswaIPS(siswaIPS);

	}

	@Override
	public void getSiswaIPSByNama(String nama) {
		// TODO Auto-generated method stub
		DatabaseUtil db = new DatabaseUtil();
		SiswaIPS siswaIPS = new SiswaIPS();
		try {
			db.connect();
 
            String query = "SELECT * FROM siswaIPS WHERE nama = '"+nama+"'";
            ResultSet rs = db.readData(query);
 
            // process query results
            if (rs.next()) {
 
                ResultSetMetaData metaData = rs.getMetaData();
                int jumlahKolom = metaData.getColumnCount();
                do {
                    for (int i = 1; i <= jumlahKolom; i++) {
                    	siswaIPS.setId(Integer.parseInt(rs.getObject(1).toString()));
                    	siswaIPS.setNama(rs.getObject(2).toString());
                    	siswaIPS.setEmail(rs.getObject(3).toString());
                        siswaIPS.setLamaTunggak(Integer.parseInt(rs.getObject(4).toString()));
                        siswaIPS.setBayarSPP(Double.parseDouble(rs.getObject(5).toString()));
                        siswaIPS.setBeasiswa(Integer.parseInt(rs.getObject(6).toString()));
                    }
                } while (rs.next());
                
            } else {
            	siswaIPS.setId(0);
            }

            //close db connection
            db.disconnect();            
 
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
		
		TableView.displayTupleSiswaIPS(siswaIPS);

	}

	@Override
	public void getSiswaIPSByEmail(String email) {
		// TODO Auto-generated method stub
		DatabaseUtil db = new DatabaseUtil();
		SiswaIPS siswaIPS = new SiswaIPS();
		try {
			db.connect();
 
            String query = "SELECT * FROM siswaIPS WHERE email = '"+email+"'";
            ResultSet rs = db.readData(query);
 
            // process query results
            if (rs.next()) {
 
                ResultSetMetaData metaData = rs.getMetaData();
                int jumlahKolom = metaData.getColumnCount();
                do {
                    for (int i = 1; i <= jumlahKolom; i++) {
                    	siswaIPS.setId(Integer.parseInt(rs.getObject(1).toString()));
                    	siswaIPS.setNama(rs.getObject(2).toString());
                    	siswaIPS.setEmail(rs.getObject(3).toString());
                        siswaIPS.setLamaTunggak(Integer.parseInt(rs.getObject(4).toString()));
                        siswaIPS.setBayarSPP(Double.parseDouble(rs.getObject(5).toString()));
                        siswaIPS.setBeasiswa(Integer.parseInt(rs.getObject(6).toString()));
                    }
                } while (rs.next());
                
            } else {
            	siswaIPS.setId(0);
            }

            //close db connection
            db.disconnect();            
 
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
		
		TableView.displayTupleSiswaIPS(siswaIPS);
	}

	@Override
	public List<SiswaIPS> getAllSiswaIPS() {
		// TODO Auto-generated method stub
		List<SiswaIPS> listSiswaIPS = new ArrayList<SiswaIPS>();
		DatabaseUtil db = new DatabaseUtil();
		try {
			db.connect();
			 
            String query = "SELECT * FROM siswaIPS";
         
            ResultSet rs = db.readData(query);
 
            // process query results
            while (rs.next()) {
 
            	SiswaIPS siswaIPS = new SiswaIPS();
            	
            	siswaIPS.setId(Integer.parseInt(rs.getObject(1).toString()));
            	siswaIPS.setNama(rs.getObject(2).toString());
            	siswaIPS.setEmail(rs.getObject(3).toString());
            	siswaIPS.setLamaTunggak(Integer.parseInt(rs.getObject(4).toString()));
            	siswaIPS.setBayarSPP(Double.parseDouble(rs.getObject(5).toString()));
            	siswaIPS.setBeasiswa(Integer.parseInt(rs.getObject(6).toString()));
                
                listSiswaIPS.add(siswaIPS);
 
            } 
            //close db connection
            db.disconnect();
			
		} catch (SQLException ex) {
			System.out.println("Terjadi error: " + ex.getMessage());
		}
		
		return listSiswaIPS;
	}

	@Override
	public void saveSiswaIPS(SiswaIPS siswaIPS) {
		// TODO Auto-generated method stub
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "INSERT INTO siswaIPS (id, nama, email, lama_tunggak, bayar_spp,beasiswa)"
					+ " VALUES ("+siswaIPS.getId()+", '"
					+ siswaIPS.getNama()+"', '"
					+ siswaIPS.getEmail()+"', "
					+ siswaIPS.getLamaTunggak()+", "
					+ siswaIPS.getBayarSPP()+", "
					+ siswaIPS.getBeasiswa()+")";
				
				db.executeQuery(query);
				System.out.println("Data berhasil ditambahkan!");
			} catch (Exception ex) {
				System.out.println("Terjadi error: " + ex.getMessage());
			}
	}

	@Override
	public void updateSiswaIPS(SiswaIPS siswaIPS) {
		// TODO Auto-generated method stub
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "UPDATE siswaIPS SET nama='"+siswaIPS.getNama()+"',"
					+ " email='"+siswaIPS.getEmail()+"',"
					+ " lama_tunggak="+siswaIPS.getLamaTunggak()+","
					+ " bayar_spp="+siswaIPS.getBayarSPP()+","
					+ " beasiswa="+siswaIPS.getBeasiswa()+" WHERE id='"+siswaIPS.getId()+"'";
			
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui!");
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
	}

	@Override
	public void deleteSiswaIPS(SiswaIPS siswaIPS) {
		// TODO Auto-generated method stub
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "DELETE FROM siswaIPS WHERE id='"+siswaIPS.getId()+"'";
			db.executeQuery(query);
			TableView.displayTabelSiswaIPS(getAllSiswaIPS());
		} catch (Exception e) {
			System.out.println("Terjadi error: " + e.getMessage());
		}
	}
}
