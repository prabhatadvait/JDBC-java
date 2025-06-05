import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
    public static  void main(String[] args) throws  Exception {

        String sql = "select name from product where id=8;";
        String url = "jdbc:postgresql://localhost:5432/prabhat";
        String username = "prabhat";
        String password = "0000";

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
        con.close();
    }
}
