package Barrons.PracticeTest1.Question4;

public interface MechanicalArm {
    int getCurrentIndex();

    boolean isFacingRight();

    void changeDirection();

    void moveForward(int numLocs);
}
