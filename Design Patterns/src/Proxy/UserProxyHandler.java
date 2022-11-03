
package Proxy;

/**
 * @author Darkmoon
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
            user = (User) new AuthorizedUser();
        } else {
            user = (User) new GuestUser();
        }
        return user;
    }
    
    
}
