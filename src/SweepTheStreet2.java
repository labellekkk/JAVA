import stanford.karel.Karel;

public class SweepTheStreet2 extends Karel {
    public void run() {

        pickBeeper();

        while(frontIsClear()) {
            move();
            if (beepersPresent()){
                pickBeeper();
            }
        }

    }
}
