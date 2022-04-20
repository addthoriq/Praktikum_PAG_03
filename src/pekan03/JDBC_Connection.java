import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_COnnection {
    
    private Connection conn;
    private String url, user, password;
    
    
    JDBC_COnnection(){
        this.url = "jdbc:mysql://localhost:3306/akademik";
        this.user = "root";
        this.password = "";
    }
    
    public void connect() throws ClassNotFoundException, SQLException{
        String urlDriver = "com.mysql.jdbc.Driver";
        Class.forName(urlDriver);
        conn = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
    }
    
    public void closeConnection() throws SQLException {
        conn.close();
    }
    
    public void tampilkanIsiTable(){
        try{
            Statement stat = conn.createStatement();
            ResultSet rSet = stat.executeQuery("SELECT * FROM mahasiswa");
            
            while(rSet.next()){
                BigDecimal id = rSet.getBigDecimal("nim");
                String nama = rSet.getString("nama");
                String alamat = rSet.getString("alamat");
                String kode_prodi = rSet.getString("kode_prodi");
                
                System.out.println("id : " + id);
                System.out.println("nama : " + nama);
                System.out.println("alamat : " + alamat);
                System.out.println("kode_prod : " + kode_prodi);
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateTable (String st) {
        try{
            Statement stat = conn.createStatement();
            ResultSet rSet = stat.executeQuery("SELECT * FROM BOOK");
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
