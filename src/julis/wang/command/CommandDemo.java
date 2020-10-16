package julis.wang.command;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 19:20
 *
 * Description :
 *          命令模式
 *          将请求转换为一个包含与请求相关的所有信息的独立对象。
 *          该转换让你能根据不同的请求将方法参数化、 延迟请求执行或将其放入队列中， 且能实现可撤销操作。
 *
 *          优缺点：
 *              ……
 *              1、以在不修改已有客户端代码的情况下在程序中创建新的命令。
 *              2、将一组简单命令组合成一个复杂命令。
 *
 * History   :
 *
 *******************************************************/

public class CommandDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        //Those logic may contains in Editor class when
        //some events happen it will call do those action
        //here just for test.
        Command copyCommand = new CopyCommand(editor);
        copyCommand.execute();

        Command cutCommand = new CutCommand(editor);
        cutCommand.execute();
    }
}
