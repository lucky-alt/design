import java.util.Scanner;

public class LoginForm {
    private UserDAO userDao;
    private String userName;
    private String userPassword;
    public LoginForm(UserDAO userDAO,String userName,String userPassword){
        this.userDao = userDAO;
        this.userName = userName;
        this.userPassword = userPassword;
        this.init();
        this.display();
    }
    public void init(){
        System.out.println("Welcome!");
    }
    public void display(){
        System.out.println("Display interface!");
    }
    public void validate(){
        System.out.println("verification!");
        userDao.findUser(userName,userPassword);
    }
}