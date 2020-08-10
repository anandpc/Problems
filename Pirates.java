import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Pirates {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 7, 5};
        System.out.println(pirates(arr));
    }

    public static int pirates(int[] arr) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int value : arr) linkedList.add(value);

        int days = 0;

        while (true) {
            List<Integer> shipsToBeDestroyed = new ArrayList<>();
            // identify the ships which will be destroyed
            for (int i = 1; i < linkedList.size(); i++) {
                if (linkedList.get(i) > linkedList.get(i - 1)) {
                    //System.out.println("days = " + days + " list = " + linkedList);
                    shipsToBeDestroyed.add(linkedList.get(i));
                }
            }

            // if no ships to destroyed break the loop
            if (shipsToBeDestroyed.isEmpty()) {
                break;
            }
            // remove all identified ships which will be destroyed
            for (Integer ships : shipsToBeDestroyed) {
                linkedList.remove(ships);
            }
            //System.out.println(linkedList);
            days++;
        }

        return days;
    }
}