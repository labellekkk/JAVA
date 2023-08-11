import stanford.karel.Karel;

public class ExPickFruitsV1C extends Karel {
    public void run(){
        while (frontIsClear()) {
            move();
        }
        turnLeft();
        for (int i = 0; i < 6; i++) {
            move();
        }

        pickBeeper();

        turnLeft();
        turnLeft();
        turnLeft();

        move();

        turnLeft();
        turnLeft();
        turnLeft();

        pickBeeper();
        while (frontIsClear()){
            move();
        }
        turnLeft();


    }
}
