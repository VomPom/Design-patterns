package julis.wang.abstract_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 09:50
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class Application {
    private final IButton button;
    private final ITextView textView;

    public Application(IGuiFactory factory) {
        button = factory.createButton();
        textView = factory.createTextView();
    }

    public void draw() {
        button.onClick();
        textView.showText();
    }
}
