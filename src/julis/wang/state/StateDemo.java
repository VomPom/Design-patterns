package julis.wang.state;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 19:50
 *
 * Description :
 *              状态模式:
 *                  一种行为设计模式， 能在一个对象的内部状态变化时改变其行为，
 *                  使其看上去就像改变了自身所属的类一样。
 *              优缺点：
 *                  优点
 *                  1、将与特定状态相关的代码放在单独的类中
 *                  2、无需修改已有状态类和上下文就能引入新状态。
 *                  3、通过消除臃肿的状态机条件语句简化上下文代码。
 *
 *                  缺点：
 *                  如果状态机只有很少的几个状态， 或者很少发生改变， 那么应用该模式可能会显得小题大作
 *
 * History   :
 *
 *******************************************************/

public class StateDemo {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println(player.getState().onPlay());
        System.out.println(player.getState().onPause());
        System.out.println(player.getState().onPause());
        System.out.println(player.getState().onPlay());
        System.out.println(player.getState().onPause());
        System.out.println(player.getState().onPlay());
        System.out.println(player.getState().onPlay());
        System.out.println(player.getState().onPlay());
        System.out.println(player.getState().onPlay());
    }
}
