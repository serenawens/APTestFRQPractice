package FRQ2007.Question1;

import java.util.Arrays;

public class SelfDivisor {
    /** @param number the number to be tested
     * Precondition: number > 0
     * @return true if every decimal digit of number is a divisor of number;
     * false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        //assume that the number IS a self divisor, check for something that doesn't work
        int temp =number;
        while(temp>0)
        {
            int remainder=temp%10;
            temp/=10;
            if(remainder==0)
            {
                return false;
            }
            else if ( number % remainder != 0)
            {
                return false;
            }

        }
        return true;
    }
    /** @param start starting point for values to be checked
     * Precondition: start > 0
     * @param num the size of the array to be returned
     * Precondition: num 0 >
     * @return an array containing the first num integers ≥ start that are self-divisors
     */
    public static int[] firstNumSelfDivisors(int start, int num)
    {
        int[] selfDivisors = new int[num];
        int index=0;
        while(index<selfDivisors.length)
        {
            if(isSelfDivisor(start))
            {
                selfDivisors[index]=start;
                index++;
            }
            start++;
        }
        return selfDivisors;
    }

    //SelfDivisorTester
    public static void main(String[] args)
    {
        System.out.println(SelfDivisor.isSelfDivisor(126));
        System.out.println(SelfDivisor.isSelfDivisor(26));

        System.out.println(Arrays.toString(SelfDivisor.firstNumSelfDivisors(10,3)));
    }
}
