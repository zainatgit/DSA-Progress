package programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Playground {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        int[] num = {3,2,1,5,6,4};
        List<String> stringList = List.of("Spring", "Spring Boot","AWS","Docker","Kubernetes","Microservices");
        /*System.out.println(numbers.stream()
                .reduce(0,(x,y)-> x+y*y));
        System.out.println(numbers.stream().filter(x->x%2!=0).reduce(0,(x,y)->x+y));*/
        //numbers.stream().distinct().forEach(System.out::println);
        //stringList.stream().sorted(Comparator.comparing(x -> x.length())).forEach(System.out::println);
        List<Integer> squaredList = populateResult(numbers, x->x*2);
        squaredList.stream().forEach(System.out::println);
        List<Integer> cubeList = populateResult(numbers, x->x*x*x);
        cubeList.stream().forEach(System.out::println);
    }

    public static List<Integer> populateResult(List<Integer> numberList, Function<Integer,Integer> function){
        return numberList.stream().map(function).collect(Collectors.toList());
    }
}

// foreach -> one by one
// map -> alters each element and forwards further
// filter -> filters out based on condition, use this as first step
// reduce -> produce single result from stream, starting_value, (subtotal, element) -> subtotal+element
// distinct -> filters for distinct values
// sorted -> sorts the stream. Parameters in sorted -> Comparator.naturalOrder() , Comparator.reverseOrder(), Custom comparator Comparator.comparing(x -> x.length())
// collect -> collects the stream and returns in form of Collection. collect(Collectors.asList())