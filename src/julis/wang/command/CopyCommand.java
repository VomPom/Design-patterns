package julis.wang.command;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 19:20
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        editor.copy();
    }
}
