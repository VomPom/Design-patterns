package julis.wang.adapter;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/20 10:01
 *
 * Description : 适配器模式:
 *                  是一种结构型设计模式， 它能使接口不兼容的对象能够相互合作。
 *                  优缺点：
 *                  优点：
 *                  1、单一职责原则，可以将接口或数据转换代码从程序主要业务逻辑中分离。
 *                  2、开闭原则。只要客户端代码通过客户端接口与适配器进行交互，
 *                  就能在不修改现有客户端代码的情况下在程序中添加新类型的适配器。
 *                  缺点：
 *                  1、代码整体复杂度增加，因为需要新增一系列接口和类。
 *                  有时直接更改服务类使其与其他代码兼容会更简单
 * History   :
 *
 *******************************************************/

public class AdapterDemo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rPeg = new RoundPeg(5);
        if (hole.fits(rPeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
