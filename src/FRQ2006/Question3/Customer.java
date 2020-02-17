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
        if(this.getName().compareTo(other.getName())==0)
        {
            return this.getID()-other.getID();
        }
        return 0;
    }

    public static void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result)
    {

    }
}
