package julis.wang.state;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 19:48
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class Player {
    State state;

    public Player() {
        changeState(new ReadyState(this));
    }

    public State getState() {
        return state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void play() {
        System.out.println("now playing...");
    }
}
