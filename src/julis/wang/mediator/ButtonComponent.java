package julis.wang.mediator;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 10:23
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class ButtonComponent implements Component {
    Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "button";
    }

    public void clear() {
        System.out.println("ButtonComponent clear text.");
    }
}
