import stanford.karel.Karel;

public class ExGoAroundTheWorld1 extends Karel {
    public  void run(){
        while(frontIsClear()){
            move();
            if(frontIsBlocked()){
                turnLeft();
            }
        }
        turnLeft();
    }

}

