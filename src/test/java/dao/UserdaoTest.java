package dao;

import domain.User;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class UserdaoTest {
    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        Userdao userdao = new Userdao();
        User user = new User();
        user.setId("09");
        user.setName("nomukun");
        user.setPassword("523");
        userdao.add(user);
    }

}