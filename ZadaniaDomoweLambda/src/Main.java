import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> toUpperCase = Arrays.asList("Lorem",
                "ipsum", "dolor", "sit amet",
                "consectetur",
                "adipiscing elit");

        System.out.println(String.join(", ", toUpperCase));

    }
    private static List<String> upperCase(List<String> list) {
    return list.stream()
            .map(x -> x.toUpperCase())
            .collect(Collectors.toList());
    }
    // AVERAGE MANUALNIE
  //  private double average(List<Integer> list) {
    //    int sum = 0;
      //  for (int element : list) {
        //    sum += element;
       // }
        // return (double) sum / list.size();
   // }

    //AVERAGE WITH STREAMS

    List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    private static double average(List<Integer> list) {
        return list.stream().mapToInt(x -> x)
                .average()
                .getAsDouble();
    }
    List<String> toFilter = Arrays.asList("Lorem",
            "ipsum", "dolor", "sit amet",
            "consectetur", "arg",
            "adipiscing elit", "arr");

    private static List<String> search(List<String> list) {
    return list.stream()
            .filter(x -> x.startsWith("a") && x.length() == 3)
            .collect(Collectors.toList());

    }

    private static String getString(List<Integer> list) {
    return list.stream()
            .map(x -> {
                if (x % 2 == 0) {
                    return "e" + x;
                } else if (x % 2 == 1) {
                    return "o" + x;
                }
            }).collect(Collectors.joining(", "));

    // return list.stream()
        //                .map(x -> x % 2 == 0 ? "e" + x : "o" + x)
        //                .collect(Collectors.joining(","));
    }

}
