package src.Week_3.Library.main;

import src.Week_3.Library.model.Role;
import src.Week_3.Library.model.User;
import src.Week_3.Library.service.UserService;

public class Main {

    public static void main(String[] args) {
        //створення кількох користувачів
        UserService service = new UserService();

        service.addUser(new User("Demian", "demian@gmail.com", Role.ADMIN));
        service.addUser(new User("Robert", "robert@gmail.com", Role.USER));
        service.addUser(new User("Alina", "alina@gmail.com", Role.USER));
        service.addUser(new User("Ola", "ola@gmail.com", Role.GUEST));
        service.addUser(new User("Ola", "ola@gmail.com", Role.GUEST));

        //вивід усіх користувачів
        service.printAllUsers();

        User found = service.findUserByUsername("Robert");
        if (found != null) {
            System.out.println("User is found:  " + found);
        } else {
            System.out.println("User not found");
        }
    }
}
