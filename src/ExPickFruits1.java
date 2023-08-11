import stanford.karel.Karel;

public class ExPickFruits1 extends Karel {
    public void run(){
        for (int i = 0; i < 12; i++) {
            move();
            if(frontIsBlocked()){
                turnLeft();
            }
        }
        for (int j = 0; j < 6; j++) {
            move();
            if(beepersPresent()){
                pickBeeper();
            }
        }
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        
        if (beepersPresent()){
            pickBeeper();
        }else{
            move();
        }
        
        turnLeft();
        turnLeft();
        turnLeft();
        for (int i = 0; i < 6; i++) {
            move();
            if(beepersPresent()){
                pickBeeper();
            }
        }
        turnLeft();
    }
}
