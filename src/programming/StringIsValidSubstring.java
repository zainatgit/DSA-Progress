package programming;

import java.util.ArrayList;

public class StringIsValidSubstring {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("A");
        al.remove("A");
        al.stream().forEach(System.out::println);
    }
}
