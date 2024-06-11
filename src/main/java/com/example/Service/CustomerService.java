package com.example.Service;

import com.example.Bean.User;
import com.example.Dao.Inter.ICustomerDao;
import com.example.Service.Inter.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    @Qualifier(value = "dao1")
    ICustomerDao customerDao;

    @Override
    public List<User> getUsers() {
        List<User> users = customerDao.getUsers();
        for (User u : users) {
            System.out.println(u);
        }
        return users;
    }
}
