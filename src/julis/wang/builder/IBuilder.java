package julis.wang.builder;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 10:03
 *
 * Description :
 * History   :
 *
 *******************************************************/

public interface IBuilder {
    IBuilder setColor(int color);

    IBuilder setCPU(String cpu);

    IBuilder setCard(String card);
}
