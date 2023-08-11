import stanford.karel.Karel;

public class ExMakeTripleBeeperPilesOnStreet extends Karel {

        public void run() {
                while (frontIsClear()){
                        putBeeper();
                        move();
                }
                putBeeper();
        }
}
