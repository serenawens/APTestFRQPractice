package FiveSteps.PracticeExam1.Question1;

import java.util.ArrayList;

public class RegularHexagon {
    private ArrayList<CoordinatePoint> points;

    //Time taken: 10 min
    public double getSideLength() {
        double x1 = points.get(0).getX();
        double y1 = points.get(0).getY();
        double x2 = points.get(1).getX();
        double y2 = points.get(1).getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double getArea() {
        double s = this.getSideLength();
        return (Math.pow(s, 2) * 3 * Math.sqrt(3)) / 2.0;
    }

    public CoordinatePoint getCenter() {
        double x1 = points.get(0).getX();
        double y1 = points.get(0).getY();
        double x2 = points.get(3).getX();
        double y2 = points.get(3).getY();

        return new CoordinatePoint((x1 + x2) / 2, (y1 + y2) / 2);

    }


}
