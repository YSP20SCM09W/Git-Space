import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(7);
        List<Integer> newList = list.stream().sorted((s1, s2) -> s1 - s2).collect(Collectors.toList());
        for(int num : newList){
            System.out.println(num);
        }
        List<Integer> list2 = list.stream().filter(s1 -> (s1 > 6)).collect(Collectors.toList());
        for(int num : list2){
            System.out.println(num);
        }
    }
}