package latihan;

class latihan2 {
    int x, y;
    int width, height;

    void moveLeft() {
        this.x -= 1;
    }

    void moveRight() {
        this.x += 1;
    }

    void moveUp() {
        this.y -= 1;
    }

    void moveDown() {
        this.y += 1;
    }

    void printPosisition() {
        
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }
}