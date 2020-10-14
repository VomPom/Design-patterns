package julis.wang.abstract_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 09:48
 *
 * Description :
 * History   :
 *
 *******************************************************/
public class WindowsTextView implements ITextView {
    @Override
    public void showText() {
        System.out.println("Windows show text.");
    }
}
