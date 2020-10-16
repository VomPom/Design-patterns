package julis.wang.state;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 19:56
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class ReadyState extends State {
    ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onPlay() {
        player.changeState(new PlayState(player));
        player.play();
        return "ready to on play.";
    }

    @Override
    public String onPause() {
        player.changeState(new PauseState(player));
        return "ready to on pause.";
    }
}
