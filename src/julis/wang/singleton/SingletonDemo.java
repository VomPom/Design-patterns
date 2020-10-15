package julis.wang.singleton;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 09:43
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.speak();

        Singleton instance2 = Singleton.getInstance();
        instance2.speak();

        Singleton instance3 = Singleton.getInstance();
        instance3.speak();

        System.out.println(instance == instance2);
        System.out.println(instance2 == instance3);
        System.out.println(instance == instance3);
    }
}
