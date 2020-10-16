package julis.wang.state;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 19:48
 *
 * Description :
 * History   :
 *
 *******************************************************/

public abstract class State {
    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract String onPlay();

    public abstract String onPause();
}
