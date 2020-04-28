package Barrons.PracticeTest1.Question4;
//20 min

import java.util.List;

public class Experiment {
    private MechanicalArm arm;
    private List<Solution> solutions;

    public void reset() {
        if (arm.getCurrentIndex() == 0 && !arm.isFacingRight())
            arm.changeDirection();
        else if (arm.getCurrentIndex() > 0) {
            if (arm.isFacingRight())
                arm.changeDirection();
            arm.moveForward(arm.getCurrentIndex());
            arm.changeDirection();
        }
    }

    public int mostAcidic() {
        reset();
        int minPH = Integer.MAX_VALUE;
        for(Solution solution: solutions)
        {
            if(solution.getPH()<minPH)
                minPH = solution.getPH();
        }
        arm.moveForward(minPH);
        if (solutions.get(arm.getCurrentIndex()).getPH() < 7)
            return 1;
        reset();
        return -1;

    }
}
