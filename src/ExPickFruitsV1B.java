import stanford.karel.Karel;

public class ExPickFruitsV1B extends Karel {
    public void run(){
        while(frontIsClear()){
            move();
        }
        turnLeft();
        for (int i = 0; i < 6 ; i++) {
            move();
            if(beepersPresent()){
                pickBeeper();
            }
        }
        turnLeft();
        turnLeft();
        turnLeft();

        move();
        pickBeeper();

        turnLeft();
        turnLeft();
        turnLeft();

            for (int i = 0; i < 6; i++) {
               move();
               if (beepersPresent()){
                   pickBeeper();
               }
            }
        turnLeft();

    }
}
