package main.java.com.brijesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermediate {

    //Returns a stream consisting of the results of applying the given function to the elements of this stream.
    public void map(){
        List<Integer> number = Arrays.asList(2,3,4,6,8);
        List square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);
    }

    public void filter(){

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> result = strings.stream().filter(x->x.startsWith("a")).collect(Collectors.toList());
        System.out.println(result);

    }

    public void sorted(){
        List<String> str = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = str.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }


}
