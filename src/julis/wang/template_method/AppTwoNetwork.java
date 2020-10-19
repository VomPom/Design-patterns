package julis.wang.template_method;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 10:08
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class AppTwoNetwork extends Network {
    public AppTwoNetwork(String userName, String password) {
        super(userName, password);
    }

    @Override
    boolean logIn(String userName, String password) {
        if (userName.equals("world")) {
            System.out.println("App two log success.");
            return true;
        }
        System.out.println("App two log fail.");
        return false;
    }

    @Override
    boolean sendData(byte[] data) {
        System.out.println("App two send data success.");
        return true;
    }

    @Override
    void logOut() {
        System.out.println("App two log out.");
    }
}
