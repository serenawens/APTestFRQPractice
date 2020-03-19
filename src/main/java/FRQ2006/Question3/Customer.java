package FRQ2006.Question3;

public class Customer {
    private String name;
    private int ID;
    public Customer(String customerName, int idNum)
    {
        name = customerName;
        ID = idNum;
    }

    public String getName()
    {
        return name;
    }
    public int getID()
    {
        return ID;
    }
    // returns 0 when this customer is equal to other;
    // a positive integer when this customer is greater than other;
    // a negative integer when this customer is less than other
    public int compareCustomer(Customer other)
    {
        if(getName().compareTo(other.getName())==0) //if the names are the same, compare their ID
        {
            return getID()-other.getID();
        }
        else
        return getName().compareTo(other.getName());

    }

    public static void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result)
    {
        int ind1=0;
        int ind2=0;
        for(int i=0; i<result.length; i++)
        {
            int comparison = list1[ind1].compareCustomer(list2[ind2]);
            if(comparison>0)
            {
                result[i]=list2[ind2];
                ind2++;
            }
            else if(comparison==0)
            {
                result[i] =list1[ind1];
                ind1++;
                ind2++;
            }
            else if(comparison<0)
            {
                result[i] = list1[ind1];
                ind1++;
            }
        }
    }

    public String toString()
    {
        return name +": "+ ID;
    }
}
