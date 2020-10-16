package julis.wang.command;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 19:19
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class CutCommand extends Command {
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        editor.cut();
    }
}
