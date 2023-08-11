import stanford.karel.Karel;

public class ExGoAroundTheWorld2 extends Karel {
    public void run(){
        turnLeft();
            for(int i=0; i<4; i++){
                move();

                while (frontIsBlocked()) {
                    turnLeft();
                }
        }

    }
}
