package julis.wang.observer;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/16 10:08
 *
 * Description :
 *          观察者模式：
 *              是一种行为设计模式， 允许你定义一种订阅机制，
 *              可在对象事件发生时通知多个 “观察” 该对象的其他对象
 *          优缺点：
 *              优点：
 *              1、无需修改发布者代码就能引入新的订阅者类 （如果是发布者接口则可轻松引入发布者类）
 *              2、可以在运行时建立对象之间的联系
 *              缺点：
 *              订阅者的通知顺序是随机的
 *
 * History   :
 *
 *******************************************************/

public class ObserverDemo {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager("email");
        EmailNotificationListener emailNotificationListener = new EmailNotificationListener("123456789@qq.com");
        eventManager.subscribe("email", emailNotificationListener);
        eventManager.notify("email", "info1");
        eventManager.notify("email", "info2");
        eventManager.unsubscribe("email", emailNotificationListener);

        System.out.println("Unsubscribe email listener, then notify.");

        eventManager.notify("email", "info");


    }
}








