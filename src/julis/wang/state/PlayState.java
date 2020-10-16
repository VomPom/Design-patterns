package julis.wang.state;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 19:49
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class PlayState extends State {
    PlayState(Player player) {
        super(player);
    }

    @Override
    public String onPlay() {
        return "already onPlay...";
    }

    @Override
    public String onPause() {
        player.changeState(new PauseState(player));
        return "onPause";
    }
}
