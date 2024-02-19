package latihan;

class latihan2 {
    int x, y;
    int width, height;

    latihan2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        this.x -= 1;
        System.out.println("Bergerak kekiri 1 langkah");
    }

    void moveRight() {
        this.x += 1;
        System.out.println("Bergerak kekanan 1 langkah");
    }

    void moveUp() {
        this.y -= 1;
        System.out.println("Bergerak keatas 1 langkah");
    }

    void moveDown() {
        this.y += 1;
        System.out.println("Bergerak kebawah 1 langkah");
    }

    void printPosisition() {
        System.out.println("x : " + width + ", y : " + height);
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }

    void display() {
        printPosisition();
        if (width == 0 || width > x) {
            detectCollision(x, y);
        }
    }
}