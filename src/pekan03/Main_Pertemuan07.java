
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        JDBC_COnnection jdbc = new JDBC_COnnection();
        jdbc.connect();
        jdbc.tampilkanIsiTable();
        jdbc.closeConnection();
        
    }
}
