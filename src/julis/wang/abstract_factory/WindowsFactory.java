package julis.wang.abstract_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 09:46
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class WindowsFactory implements IGuiFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextView createTextView() {
        return new WindowsTextView();
    }
}
