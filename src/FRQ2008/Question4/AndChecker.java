package FRQ2008.Question4;

public class AndChecker implements Checker{
    private Checker check1;
    private Checker check2;

    public AndChecker(Checker key1, Checker key2)
    {
        check1 = key1;
        check2 =key2;
    }

    @Override
    public boolean accept(String text)
    {
        return check1.accept(text) && check2.accept(text);
    }
}
