package dao;

import domain.User;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class UserDaoTest {
    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setId(0);
        user.setName("nomukun");
        user.setPassoword("523");
        userDao.add(user);
    }

}