package julis.wang.template_method;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 09:52
 *
 * Description :
 *              模板方法模式:
 *              一种行为设计模式， 它在超类中定义了一个算法的框架，
 *              允许子类在不修改结构的情况下重写算法的特定步骤。
 *              优缺点：
 *                  优点：
 *                  1、允许客户端重写一个大型算法中的特定部分， 使得算法其他部分修改对其所造成的影响减小。
 *                  2、可将重复代码提取到一个超类中
 *                  缺点：
 *                  1、部分客户端可能会受到算法框架的限制。
 *                  2、通过子类抑制默认步骤实现可能会导致违反里氏替换原则
 *                  3、模板方法中的步骤越多， 其维护工作就可能会越困难
 *
 * History   :
 *
 *******************************************************/

public class TemplateMethodDemo {
    public static void main(String[] args) {
        AppOneNetwork oneNetwork = new AppOneNetwork("hello", "password");
        oneNetwork.post("one message");
        AppTwoNetwork twoNetwork = new AppTwoNetwork("hello", "password");
        twoNetwork.post("two message");
    }
}
