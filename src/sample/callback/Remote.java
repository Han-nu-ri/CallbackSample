package sample.callback;

/**
 * Created by Koo Lee on 3/27/2015.
 */
public class Remote {

    private final RemoteCallback callback;

    public Remote(RemoteCallback callback) {
        this.callback = callback;
    }

    public void logic() {
        System.out.println("logic");

        callback.callback("new message");
    }
}
