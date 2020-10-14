package julis.wang.abstract_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 09:43
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class MacFactory implements IGuiFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextView createTextView() {
        return new MacTextView();
    }
}
