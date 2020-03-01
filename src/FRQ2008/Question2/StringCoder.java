package FRQ2008.Question2;

import java.util.ArrayList;

public class StringCoder {
    private String masterString;

    /**
     * @param master the master string for the StringCoder
     *               Precondition: the master string contains all the letters of the alphabet
     */
    public StringCoder(String master) {
        masterString = master;
    }

    /**
     * @param parts an ArrayList of string parts that are valid in the master string
     *              Precondition: parts.size() > 0
     * @return the string obtained by concatenating the parts of the master string
     */
    public String decodeString(ArrayList<StringPart> parts) {
        String decode = "";
        for (StringPart part : parts) {
            decode = decode + masterString.substring(part.getStart(), part.getStart() + part.getLength());
        }
        return decode;
    }

    /**
     * @param str the string to encode using the master string
     *            Precondition: all of the characters in str appear in the master string;
     *            str.length() > 0
     * @return a string part in the master string that matches the beginning of str.
     * The returned string part has length at least 1.
     */
    private StringPart findPart(String str) {
        StringPart string = new StringPart(4, 5 );
        return string;
    }

    /**
     * @param word the string to be encoded
     *             Precondition: all of the characters in word appear in the master string;
     *             word.length() > 0
     * @return an ArrayList of string parts of the master string that can be combined
     * to create word
     */
    public ArrayList<StringPart> encodeString(String word)
    {
        ArrayList<StringPart> encoded = new ArrayList<StringPart>();
        String copy = word;
        while(copy.length()>0)
        {
            StringPart str = findPart(copy);
            encoded.add(str);
            if(str.getLength()!=copy.length())
            {
                copy = copy.substring(str.getLength());
            }
        }
        return encoded;
    }
}