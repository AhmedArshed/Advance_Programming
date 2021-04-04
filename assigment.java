
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
public class assigment {
    
    public static List<Integer> Fibonacci(int series) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(series)
                .map(n -> n[0])
                .collect(toList());
    }

    static void link_list(){
        LinkedList<String> link_list = new LinkedList<String>();
  
        link_list.add("A");
        link_list.add("B");
        link_list.addLast("C");

        link_list.removeFirst();
        link_list.removeLast();
  
        System.out.println(link_list);
    }

  public static void main(String[] args) {
        System.out.println(Fibonacci(10));
        Integer empIds[] = { 1, 2, 3, 4 , 1};
        List<Integer> list = Arrays.asList(empIds);
        System.out.println(list.stream().anyMatch(var -> var == 1));
        list.stream()
        .distinct()
        .sorted()
        .forEach(a-> System.out.println(a));

        link_list();
    }
}