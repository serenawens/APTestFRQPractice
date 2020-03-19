package FRQ2008.Question4;

public class NotChecker implements Checker {
    private Checker check;

    public NotChecker(Checker obj) {
        check = obj;
    }

    @Override
    public boolean accept(String text) {
        return false;
    }
}
