package julis.wang.composite;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 19:45
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class View implements IView {
    String name;

    public View(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(name + " draw.");
    }
}
