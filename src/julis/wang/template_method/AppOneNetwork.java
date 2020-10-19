package julis.wang.template_method;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 10:05
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class AppOneNetwork extends Network {
    public AppOneNetwork(String userName, String password) {
        super(userName, password);
    }

    @Override
    boolean logIn(String userName, String password) {
        if (userName.equals("hello")) {
            System.out.println("App one log success.");
            return true;
        }
        System.out.println("App one log fail.");
        return false;
    }

    @Override
    boolean sendData(byte[] data) {
        System.out.println("App one send data success.");
        return true;
    }

    @Override
    void logOut() {
        System.out.println("App one log out.");
    }
}
