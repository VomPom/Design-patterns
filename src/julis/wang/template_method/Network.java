package julis.wang.template_method;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 10:04
 *
 * Description :
 * History   :
 *
 *******************************************************/

public abstract class Network {
    String userName;
    String password;

    public Network(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract void logOut();

}
