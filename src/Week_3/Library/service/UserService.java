package src.Week_3.Library.service;

import src.Week_3.Library.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    //addUser(User user) — додає користувача (якщо не дублюється по email)
    public void addUser(User user) {
        for (User u : users) {
            if (u.getEmail().equals(user.getEmail())) {
                System.out.println("User exist with this email: " + user.getEmail());
                return;
            }
        }
        users.add(user);
        System.out.println("Added user : " + user.getUsername());
    }

    //printAllUsers() — виводить усіх
    public void printAllUsers() {
        System.out.println("All users : ");
        for (User user : users) {
            System.out.println(user);
        }
    }

    //findUserByUsername(String username) — повертає користувача (або null)
    public User findUserByUsername(String username) {
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }
}

