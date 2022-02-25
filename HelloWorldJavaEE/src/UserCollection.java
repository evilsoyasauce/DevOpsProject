
import java.util.*;

public class UserCollection {

    private ArrayList<User> users = new ArrayList<>();
    private int capacity;

    public UserCollection() {
        this.capacity = 20;
    }

    public UserCollection(int capacity) {
        this.capacity = capacity;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
    	if(users.size() != capacity) {
    		users.add(user);
    	}
    }
    
    public User findUsersById(String id) {
    	for (User s : users) { 		      
            if(s.getName().equals(id)) return s;
       }
    	return null;
    }

    public User findUserByEmail(String email) {
    	for (User s : users) { 		      
            if(s.getEmail().equals(email)) return s;
       }
    	return null;
    }
}