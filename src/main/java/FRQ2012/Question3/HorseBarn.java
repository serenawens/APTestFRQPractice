package FRQ2012.Question3;

import java.util.ArrayList;

public class HorseBarn {
    /**
     * The spaces in the barn. Each array element holds a reference to the horse
     * that is currently occupying the space. A null value indicates an empty space.
     */
    private Horse[] spaces;

    public HorseBarn(int num) {
        spaces = new Horse[num];
    }

    public void add(int index, Horse horse) {
        spaces[index] = horse;
    }

    public String toString() {
        String list = "";
        for (Horse horse : spaces) {
            if (horse == null) {
                list += "null, ";
            } else {
                list += horse.getName() + ", ";
            }
        }
        return "[ " + list + " ]";
    }

    /**
     * Returns the index of the space that contains the horse with the specified name.
     * Precondition: No two horses in the barn have the same name.
     *
     * @param name the name of the horse to find
     * @return the index of the space containing the horse with the specified name;
     * -1 if no horse with the specified name is in the barn.
     */
    public int findHorseSpace(String name) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i]!= null && name.equals(spaces[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void consolidateA()
    {
        ArrayList<Horse> temp = new ArrayList<Horse>();
        for(Horse horse: spaces)
        {
            if(horse!=null)
            {
                temp.add(horse);
            }
        }
        int horseNum = temp.size();
        for(int i=0; i<spaces.length; i++)
        {
            if(horseNum>0)
            {
                spaces[i] = temp.get(i);
                horseNum--;
            }
            else
            {
                spaces[i] = null;
            }
        }
    }
    /**
     * Consolidates the barn by moving horses so that the horses are in adjacent spaces,
     * starting at index 0, with no empty space between any two horses.
     * Postcondition: The order of the horses is the same as before the consolidation.
     */
    public void consolidate() {
        int nullIndex = -1;
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == null) {
                nullIndex = i;
                break;
            }
        }
        if (nullIndex != -1) {
            int currentFull;
            for (int k = nullIndex + 1; k < spaces.length; k++) {
                if (spaces[k] != null) {
                    Horse temp = spaces[nullIndex];
                    spaces[nullIndex] = spaces[k];
                    spaces[k] = temp;
                    nullIndex++;
                }


            }

        }
    }
}
