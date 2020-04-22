package FiveSteps.PracticeExam1.Question3;

import java.util.ArrayList;

public class Train {
    private ArrayList<TrainCar> trainCars;
    private Engine engine;
    public ArrayList<TrainCar> removeExcessTrainCars()
    {
        // 1. Find weight of the whole train
        double trainWeight = engine.getWeight();
        for(TrainCar car: trainCars)
        {
            trainWeight += car.getTotalWeight();
        }
        ArrayList<TrainCar> removedCars = new ArrayList<TrainCar>();
        // 2. Check weight
        while(trainWeight>=engine.getMaximumWeight())
        {
            trainWeight -= trainCars.get(trainCars.size()-1).getTotalWeight();
            removedCars.add(trainCars.remove(trainCars.size()-1));
        }
        return removedCars;
    }
}
