package julis.wang.composite;

import java.util.ArrayList;
import java.util.List;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 19:45
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class ViewGroup implements IView {
    List<IView> views = new ArrayList<>();

    String name;

    public ViewGroup(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(name + " draw start.");
        for (IView view : views) {
            view.draw();
        }
        System.out.println(name + " draw end.\n");
    }

    public void addView(IView view) {
        views.add(view);
    }
}
