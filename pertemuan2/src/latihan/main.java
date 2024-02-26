package latihan;

public class Main {
    public static void main(String[] args) {
        latihan2 nagaBonar = new latihan2(1, 2);

        nagaBonar.printPosisition();

        nagaBonar.moveLeft();
        nagaBonar.moveRight();

        nagaBonar.detectCollision(0, 0);
    }
}
