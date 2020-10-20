package julis.wang.adapter;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/20 10:24
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
