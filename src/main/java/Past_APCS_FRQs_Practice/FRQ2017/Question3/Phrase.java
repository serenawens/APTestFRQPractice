package Past_APCS_FRQs_Practice.FRQ2017.Question3;

public class Phrase {
    private String currentPhrase;
    public int findNthOccurrence(String str, int n)
    {
        return 0;
    }

    // APID: 99V0W60Y
    // SW
    // QUESTION 3: PART A

    /**
     * SCORE: 5/5
     */
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        int nthOccurrence = findNthOccurrence(str,n);
        if(nthOccurrence>-1)
        {
            currentPhrase = currentPhrase.substring(0,nthOccurrence) + repl
                    + currentPhrase.substring(nthOccurrence+str.length());
        }
    }

    // APID: 99V0W60Y
    // SW
    // QUESTION 3: PART B
    /**
     * SCORE: /4
     */
    public int findLastOccurrence(String str)
    {
        int n = 0;
        int currentOccurrence = findNthOccurrence(str, n); // +0
        while (currentOccurrence!=-1){
            n++; // +1
            currentOccurrence = findNthOccurrence(str, n);
        }
        return currentOccurrence;
    }

    public int findLastOccurrenceA(String str)
    {
        int n =1;
        int occurrence = findNthOccurrence(str,n);
        do {
            occurrence = findNthOccurrence(str,n);
            n++;
        }while(occurrence!=-1);
        return occurrence;
    }

}
