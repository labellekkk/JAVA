import stanford.karel.Karel;

public class ExGoAroundTheWorld3 extends Karel {
    public  void run(){
        if(frontIsBlocked()){
            turnLeft();
            turnLeft();
            turnLeft();
        }else{
            move();
        }
    }
}
