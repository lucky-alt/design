import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
    private DBUtil db;
    public UserDAO(DBUtil db){
        this.db = db;
    }

    public boolean findUser(String userName,String userPassword){
        db.geTConnection();
        if((userName == "userName")&&(userPassword == "userPassword")){
            System.out.println("Login success!");
            return true;
        }else{
            System.out.println("Error!");
            return false;
        }

    }
}