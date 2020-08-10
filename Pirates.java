import java.util.ArrayList;
import java.util.List;

class Pirates {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 7, 5};
        System.out.println(pirateShips(arr));
    }

    public static int pirateShips(int[] arr) {
        List<Integer> ships = new ArrayList<>();
        for (int loot : arr) ships.add(loot);

        int days = 0;

        while (true) {
            List<Integer> shipsToBeDestroyed = new ArrayList<>();
            // identify the ships which will be destroyed
            for (int i = 1; i < ships.size(); i++) {
                // current ship to be destroyed if it has more loot value then left one.
                if (ships.get(i) > ships.get(i - 1)) {
                    shipsToBeDestroyed.add(ships.get(i));
                }
            }

            // if no ships to destroyed break the loop
            if (shipsToBeDestroyed.isEmpty()) {
                break;
            }
            // remove all identified ships which will be destroyed
            for (Integer ship : shipsToBeDestroyed) {
                ships.remove(ship);
            }
            days++;
        }

        return days;
    }
}