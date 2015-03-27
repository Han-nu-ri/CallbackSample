package sample.callback;

/**
 * Created by Koo Lee on 3/27/2015.
 */
public class Main {

    private String testText = "original";

    public void process() {
        Remote remote = new Remote(new RemoteCallback() {
            @Override
            public void callback(String message) {
                afterProcess(message);
            }
        });

        testText = "fixed";
        remote.logic();
    }


    public void afterProcess(String message) {
        System.out.println("after process : " + message);
        System.out.println("test text : " + testText);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.process();
    }
}
