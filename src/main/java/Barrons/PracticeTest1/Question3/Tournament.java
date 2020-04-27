package Barrons.PracticeTest1.Question3;

import java.util.List;

public class Tournament {
    private Player[] slots;
    private List<String> waitingList;

    public Player requestSlot(String playerName) {
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] == null) {
                slots[i] = new Player(playerName, i);
                return slots[i];
            }
        }
        waitingList.add(playerName);
        return null;
    }

    public Player cancelAndReassignSlot(Player p) {
        int index = p.getPlayerNumber();
        if (waitingList.size() == 0) {
            slots[index] = null;
            return null;
        }
        slots[index] = new Player(waitingList.get(0), index);
        return slots[index];
    }
}
