public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0,Direction.UP);
        moveRobot(robot,-60,21);
    }

    public  static  void  moveRobot(Robot robot, int toX, int toY){

        if (toX < 0) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            } else {
                robot.turnLeft();
                robot.turnLeft();
            }

            for (int i = 0; i > toX; i--){
                robot.stepForward();
            }

        } else {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }

            for (int i = 0; i < toX; i++){
                robot.stepForward();
            }
        }

        if (toY < 0) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
            } else {
                robot.turnRight();
            }

            for (int i = 0; i > toY; i--){
                robot.stepForward();
            }
        } else {
            if (robot.getDirection() == Direction.UP) {
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            } else {
                robot.turnLeft();
            }

            for (int i = 0; i < toY; i++) {
                robot.stepForward();
            }
        }


        System.out.println(robot.getX() +" "+robot.getY()+" "+ robot.getDirection());

    }

}