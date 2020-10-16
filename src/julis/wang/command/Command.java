package julis.wang.command;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 19:17
 *
 * Description :
 * History   :
 *
 *******************************************************/

public abstract class Command {
    Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public abstract void execute();
}
