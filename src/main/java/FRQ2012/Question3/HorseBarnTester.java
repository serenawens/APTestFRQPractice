package FRQ2012.Question3;

import java.util.Arrays;

public class HorseBarnTester {
    public static void main(String[] args) {
        HorseBarn barn = new HorseBarn(25);
        barn.add(0,new HorseType("A"));
        barn.add(1,new HorseType("B"));
        barn.add(7, new HorseType("C"));
        barn.add(6,new HorseType("D"));
        barn.add(9,new HorseType("E"));
        barn.add(15,new HorseType("F"));
        barn.add(18,new HorseType("G"));
        barn.add(24, new HorseType("H"));
        String list = barn.toString();
        System.out.println(list);
        barn.consolidate();
        list = barn.toString();
        System.out.println(list);
    }

}
