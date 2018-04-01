import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private String allowedBark;
    
    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;

        final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    close();
                    timer.cancel();
                }
            }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return this.open;
    }

    public void setAllowedBark(String allowedBark) {
        this.allowedBark = allowedBark;
    }

    public String getAllowedBark() {
        return allowedBark;
    }
}