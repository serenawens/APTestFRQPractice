package FRQ2004.Question2;

public abstract class Pet {
    private String myName;

    public Pet(){}
    public Pet(String name)
    {
        myName=name;
    }
    public String getName()
    {
        return myName;
    }
    public abstract String speak();
}
