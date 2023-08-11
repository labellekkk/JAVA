import stanford.karel.Karel;

public class ExGoNorthOrSouth extends Karel {

        public void run() {
                move();
                move();

                pickBeeper();

                turnLeft();
                move();
                move();


        }

}
