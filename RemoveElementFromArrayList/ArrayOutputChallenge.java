import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayOutputChallenge {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(); // <- NO permite modificacion
        List<String> list = new CopyOnWriteArrayList<>(); // <- permite modificacion

        list.add("Arya");
        list.add("Tyrion");
        list.add("Cersei");
        list.add("Daenerys");
        list.add("Jamie");

        doProcess(list);

        System.out.println(list.size());
    }

    static void doProcess(List<String> list) {
        /*for (String character : list) {
            if(character.equals("Cersei")) {
                list.remove(character);
            }
        }*/

        // Desde java8
        list.removeIf(a -> a.equals("Cersei"));
    }
}