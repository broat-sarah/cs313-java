/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageBoard.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sarahbroat
 */
public class HardCodedUserHandler implements UserDataHandler {
    @Override
    public User getUserInformation(String username) {
        List<User> user = new ArrayList();
        user.add(new User("breadprincess", "delilah88"));
        user.add(new User("missmegan77", "candy95"));
        user.add(new User("kymesa", "kingmoses"));

        User userFound = null;
        for (User user1 : user) {
            if (username.equals(user1.getUsername())) {
                userFound = user1;
                return userFound;
            }
        }
        return userFound;
    }
}
