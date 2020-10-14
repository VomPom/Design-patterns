package julis.wang.abstract_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 09:43
 *
 * Description :
 * History   :
 *
 *******************************************************/

public interface IGuiFactory {
    IButton createButton();

    ITextView createTextView();
}
