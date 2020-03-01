package FRQ2008.Question4;

public class SubstringChecker implements Checker {
    private String mustContain;

    public SubstringChecker(String contain)
    {
        mustContain= contain;
    }
    @Override
    public boolean accept(String text)
    {
        return text.contains(mustContain);
    }
}
