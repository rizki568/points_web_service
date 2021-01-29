package web;

import java.util.LinkedList;
import java.util.List;

public class UserService implements UserServiceInterface {

    private List<User> users = new LinkedList<User>();

    public boolean createUser () {
        return users.add(new User(users.size()));
    }

    public int getBalance (int user_id) {
        return users.get(user_id).getBalance();
    }

    public int processTransaction(Transaction transaction, int user_id) {
        User user = users.get(user_id);
        user.addTransaction(transaction);
        return user.getBalance();
    }

    public Payment makePayment(int amount, int user_id) {
        return users.get(user_id).makePayment(amount);
    }
}
