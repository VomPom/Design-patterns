package julis.wang.builder;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 10:04
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class MIPhoneBuilder implements IBuilder {
    private int color;
    private String cpu;
    private String card;

    @Override
    public IBuilder setColor(int color) {
        this.color = color;
        return this;
    }

    @Override
    public IBuilder setCPU(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public IBuilder setCard(String card) {
        this.card = card;
        return this;
    }

    public MiPhone buildPhone() {
        return new MiPhone(color, cpu, card);
    }
}
