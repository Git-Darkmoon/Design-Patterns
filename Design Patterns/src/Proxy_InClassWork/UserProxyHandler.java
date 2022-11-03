package Proxy;

/**
 * @author Estudiantes
 */

public class UserProxyHandler implements UserProxy {
    private boolean isLoggedIn;

    public UserProxyHandler(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
    
    @Override
    public User getUser() {
        User user;
        
        if (isLoggedIn) {
            user = (User) new SuscribedUser();
        } else {
            user = (User) new GuestUser();
        }
        return user;
    }
}
