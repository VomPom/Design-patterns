package julis.wang.adapter;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/20 10:24
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}