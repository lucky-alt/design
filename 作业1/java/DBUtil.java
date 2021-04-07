import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBUtil {
    private Connection conn;
    public Connection geTConnection(){
        System.out.println("Database connection!");
        return conn;
    }
}