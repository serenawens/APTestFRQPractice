package Past_APCS_FRQs_Practice.FRQ2019.Question2;

public class StepTrackerTester {
    public static void main(String[] args) {
        StepTracker band = new StepTracker(10000);
        System.out.println(band.activeDays());
        System.out.println(band.averageSteps());
        band.addDailySteps(9000);
        System.out.println();
        band.addDailySteps(5000);
        System.out.println();
        System.out.println(band.activeDays());
        System.out.println(band.averageSteps());
        band.addDailySteps(13000);
        System.out.println(band.activeDays());
        System.out.println(band.averageSteps());
        band.addDailySteps(23000);
        band.addDailySteps(1111);
        System.out.println(band.activeDays());
        System.out.println(band.averageSteps());

    }
}
