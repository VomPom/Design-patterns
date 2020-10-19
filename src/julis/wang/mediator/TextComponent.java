package julis.wang.mediator;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 10:22
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class TextComponent implements Component {
    Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "text";
    }

    public void addText() {
        System.out.println("TextComponent add text.");
    }
}
