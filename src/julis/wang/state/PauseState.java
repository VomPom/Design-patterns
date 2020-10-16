package julis.wang.state;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 19:50
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class PauseState extends State {
    PauseState(Player player) {
        super(player);
    }

    @Override
    public String onPlay() {
        player.changeState(new PlayState(player));
        player.play();
        return "Pause to play...";
    }

    @Override
    public String onPause() {
        return "already on Pause...";
    }
}
