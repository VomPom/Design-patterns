package julis.wang.builder;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 10:11
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class MiPhone {
    private int color;
    private String cpu;
    private String card;

    public MiPhone(int color, String cpu, String card) {
        this.color = color;
        this.cpu = cpu;
        this.card = card;
    }

    public int getColor() {
        return color;
    }

    public String getCpu() {
        return cpu;
    }

    public String getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "MiPhone{" +
                "color=" + color +
                ", cpu='" + cpu + '\'' +
                ", card='" + card + '\'' +
                '}';
    }
}
