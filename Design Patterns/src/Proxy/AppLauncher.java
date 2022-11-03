package Proxy;

/**
 * @author Darkmoon
 */

public class AppLauncher {
    
    public static void main(String[] args) {
        
        boolean isUserLoggedIn = false;
        User user = new UserProxyHandler(isUserLoggedIn).getUser();
        user.checkOut();
    }
}
