package FRQ2011.Question4;

public class RouteCipher {
    /** A two-dimensional array of single-character strings, instantiated in the constructor */
    private String[][] letterBlock;

    /** The number of rows of letterBlock, set by the constructor */
    private int numRows;

    /** The number of columns of letterBlock, set by the constructor */
    private int numCols;

    /** Places a string into letterBlock in row-major order.
     * @param str the string to be processed
     * Postcondition:
     * if str.length() < numRows * numCols, "A" is placed in each unfilled cell
     * if str.length() > numRows * numCols, trailing characters are ignored*/
    private void fillBlock(String str)
    {
        int i=0;
        for(int row =0; row<letterBlock.length; row++)
        {
            for(int col =0; col<letterBlock[0].length; col++)
            {
                if(i<str.length())
                {
                    letterBlock[row][col]=str.substring(i,i+1);
                    i++;
                }
                else
                {
                    letterBlock[row][col]="A";
                }
            }
        }
    }

    /** Extracts encrypted string from letterBlock in column-major order.
     * Precondition: letterBlock has been filled
     * @return the encrypted string from letterBlock*/
    private String encryptBlock()
    {
        return "encrypted Block";
    }

    /** Encrypts a message.
     * @param message the string to be encrypted
     * @return the encrypted message;
     * if message is the empty string, returns the empty string*/
    public String encryptMessage(String message)
    {
        String encrypted = "";
        String copy = message;
        while(copy.length()>0)
        {
            fillBlock(copy);
            copy = copy.substring(numCols*numRows);
            encrypted += copy;
        }
        return encrypted;
    }
}
