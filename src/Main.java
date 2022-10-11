import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start(){

        List<String> list = new ArrayList<>();

        list.add("Jefferson");
        list.add("Raquel");
        list.add("Stephany");
        list.add("Neuma");
        list.add("Marcus");
        list.add("Jaca");
        list.add("Posição 10");
        list.add("Posição 11");
        list.add("Posição 12");


        list.add(2, "Maria");

        System.out.println(list.size());

        for(String i: list){
            System.out.println(i);
        }
        System.out.println("--------Lista Original--------");

        list.removeIf(x -> x.charAt(0) == 'M');
        
        for(String i: list){
            System.out.println(i);
        }
        System.out.println("---------------");

        System.out.println("Index Off Raquel: " + list.indexOf("Raquel"));

        System.out.println("---------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());

        for(String i: result){
            System.out.println(i);
        }
        System.out.println("---------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
        System.out.println(name);
    }

}
