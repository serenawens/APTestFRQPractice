package FiveSteps.PracticeExam1.Question3;

public class PassengerCar extends TrainCar {
    private double baseWeight;
    private int peopleMax;

    public PassengerCar(double baseW, int maxPeople)
    {
        baseWeight = baseW;
        peopleMax = maxPeople;
    }

    public double getTotalWeight()
    {
        return baseWeight + (peopleMax * 300);
    }


}
