import stanford.karel.Karel;

public class ExPickFruits extends Karel {
        public void run() {
                for (int i = 0; i < 8; i++) {
                        move();
                }
                turnLeft();
                for (int i=0; i<4; i++) {
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
                for (int i=0; i<4; i++) {
                        move();
                        if (beepersPresent()) {
                                pickBeeper();
                        }
                }
                turnLeft();
        }
}
