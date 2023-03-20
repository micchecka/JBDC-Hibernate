package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {


    public static void main(String[] args) {

        UserService users = new UserServiceImpl();

        users.createUsersTable();

        users.saveUser("Name1", "LastName1", (byte) 20);
        users.saveUser("Name2", "LastName2", (byte) 25);
        users.saveUser("Name3", "LastName3", (byte) 31);
        users.saveUser("Name4", "LastName4", (byte) 38);

        users.removeUserById(1);
        System.out.println(users.getAllUsers());

        users.cleanUsersTable();
        users.dropUsersTable();
    }
}

