package Communicator;

import java.util.HashSet;
import java.util.Set;

public class InMemoryUserDatabase implements UserRepository{
    private static Set<User> users = new HashSet<>();

    @Override
    public void add(User user) {
        users.add(user);
    }
}
