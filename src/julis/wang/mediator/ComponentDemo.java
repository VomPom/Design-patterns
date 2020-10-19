package julis.wang.mediator;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 10:24
 *
 * Description :
 *              中介者模式:
 *              是一种行为设计模式， 能让你减少对象之间混乱无序的依赖关系。
 *              该模式会限制对象之间的直接交互， 迫使它们通过一个中介者对象进行合作。
 *
 *              优缺点：
 *              优点：
 *              1、可以将多个组件间的交流抽取到同一位置， 使其更易于理解和维护。
 *              2、无需修改实际组件就能增加新的中介者。
 *              3、可以减轻应用中多个组件间的耦合情况。
 *              4、
 *
 * History   :
 *
 *******************************************************/

public class ComponentDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.registerComponent(new ButtonComponent());
        editor.registerComponent(new TextComponent());
        editor.addText();
        editor.clear();
    }
}
