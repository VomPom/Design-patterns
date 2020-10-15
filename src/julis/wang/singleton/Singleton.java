package julis.wang.singleton;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 09:41
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class Singleton {
    public static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void speak() {
        System.out.println("This instance hashcode is --> " + this.hashCode());
    }
}
