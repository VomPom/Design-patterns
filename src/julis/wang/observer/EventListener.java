package julis.wang.observer;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/16 10:11
 *
 * Description :
 * History   :
 *
 *******************************************************/

public interface EventListener {
    void update(String eventType, String info);
}