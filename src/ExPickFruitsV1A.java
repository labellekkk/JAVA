import stanford.karel.Karel;

public class ExPickFruitsV1A extends Karel{
    public void run() {
        for (int i = 0; i < 8; i++) {
            move();
        }
            turnLeft();
        for (int j = 0; j < 4; j++) {
                move();
                if (beepersPresent()) {
                    pickBeeper();
                }
        }

        turnLeft();
        turnLeft();
        turnLeft();
        move();

        turnLeft();
        turnLeft();
        turnLeft();
        pickBeeper();
        for (int i = 0; i < 4; i++) {

            if(beepersPresent()){
                pickBeeper();
            }
            move();
        }
        turnLeft();
    }
}
