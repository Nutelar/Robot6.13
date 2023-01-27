public class Robot {

    int x;
    int y;
    Direction dir;
    public Robot(int x, int y, Direction dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public Direction getDirection() {
        return dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        if (dir == Direction.UP) {
            dir = Direction.LEFT;
        } else if (dir == Direction.LEFT) {
            dir = Direction.DOWN;
        } else if (dir == Direction.DOWN) {
            dir = Direction.RIGHT;
        } else {
            dir = Direction.UP;
        }
    }

    public void turnRight() {
        if (dir == Direction.UP) {
            dir = Direction.RIGHT;
        } else if (dir == Direction.RIGHT) {
            dir = Direction.DOWN;
        } else if (dir == Direction.DOWN) {
            dir = Direction.LEFT;
        } else {
            dir = Direction.UP;
        }
    }

    public void stepForward() {
        if (dir == Direction.UP) {
            y = y+1;
        } else if (dir == Direction.LEFT) {
            x = x-1;
        } else if (dir == Direction.DOWN) {
            y = y-1;
        } else {
            x = x+1;
        }
    }
}