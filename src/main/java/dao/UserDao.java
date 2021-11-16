package dao;

import domain.User;

import java.sql.*;

public class UserDao {

    public void add(User user) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:postgresql://localhost:3307/bmwgs","postgres","3642");
        // 연결은 잘 됐음. ----------------------------------------------------------------------------------------

       PreparedStatement ps = c.prepareStatement("insert into users(id, name, password)  values(?,?,?)");
        ps.setLong(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassoword());

        ps.executeUpdate();

        ps.close();
        c.close();
    }

}
