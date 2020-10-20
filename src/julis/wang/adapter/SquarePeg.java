package julis.wang.adapter;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/20 10:23
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
