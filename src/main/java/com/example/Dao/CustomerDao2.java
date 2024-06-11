package com.example.Dao;

import com.example.Bean.User;
import com.example.Dao.Inter.ICustomerDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value = "dao2")
public class CustomerDao2 implements ICustomerDao {
    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Akif"));
        return users;
    }
}
