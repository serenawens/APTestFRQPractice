package FRQ2014.Question4;

public class TrioTester {
    public static void main(String[] args) {
        Sandwich cheeseburger = new Sandwich ("Cheesburger", 2.75);
        Sandwich clubSandwich = new Sandwich("Club Sandwich",2.75 );
        Salad spinach = new Salad("Spinach Salad",1.25 );
        Salad coleslaw = new Salad("Coleslaw", 1.25);
        Drink orangeSoda = new Drink("Orange Soda", 1.25);
        Drink cappuccino = new Drink("Capuccino", 3.50);
        Trio combo  = new Trio(cheeseburger,spinach,orangeSoda);
        System.out.println(combo.getName());
        System.out.println(combo.getPrice());
        Trio combo2 = new Trio(clubSandwich, coleslaw,cappuccino);
        System.out.println(combo2.getName());
        System.out.println(combo2.getPrice());
    }
}
