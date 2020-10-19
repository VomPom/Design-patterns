package julis.wang.mediator;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 10:20
 *
 * Description :
 * History   :
 *
 *******************************************************/

public interface Mediator {
    void addText();

    void clear();

    void registerComponent(Component component);
}
