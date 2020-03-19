package FRQ2006.Question3;

public class CustomerTester {
    public static void main(String[] args) {
        Customer customer1= new Customer("Arthur", 4920);
        Customer customer2= new Customer("Burton", 3911);
        Customer customer3= new Customer("Burton", 4944);
        Customer customer4= new Customer("Franz", 1692);
        Customer customer5= new Customer("Horton", 9221);
        Customer customer6= new Customer("Jones", 5554);
        Customer[] list1 = {customer1, customer2, customer3, customer4, customer5, customer6};


        Customer customer7 = new Customer("Aaron", 1729);
        Customer customer8 = new Customer("Baker", 2921);
        Customer customer9 = new Customer("Burton", 3911);
        Customer customer10 = new Customer("Dillard", 6552);
        Customer customer11= new Customer("Jones", 5534);
        Customer customer12= new Customer("Miller", 9360);
        Customer[] list2 = {customer7, customer8, customer9, customer10, customer11, customer12};

        Customer[] result = new Customer[6];

        Customer.prefixMerge(list1,list2,result);
        //System.out.println("a".compareTo("b"));

        for(Customer custom: result)
        {
            System.out.print(custom + "\t");

        }
    }
}
