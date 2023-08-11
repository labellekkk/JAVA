import stanford.karel.Karel;

public class ExMakeTripleBeeperPilesOnStreet1 extends Karel {
        public void run(){
            while (frontIsClear()){
                putBeeper();
                putBeeper();
                putBeeper();
                move();
            }
            putBeeper();
        }
}