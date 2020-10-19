package julis.wang.observer;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 19:30
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class EmailNotificationListener implements EventListener {
    String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String info) {
        System.out.println(email + " get info->" + info);
    }
}
