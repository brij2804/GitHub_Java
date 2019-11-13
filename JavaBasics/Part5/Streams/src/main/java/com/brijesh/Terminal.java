package main.java.com.brijesh;

import java.util.Arrays;
import java.util.List;

public class Terminal {

    //The forEach method is used to iterate through every element of the stream.
    public void foreach(){
        List<Integer> number = Arrays.asList(2,3,4,5);
        number.stream().map(x->x*x).forEach(y-> System.out.println(y));
    }

    //The reduce method is used to reduce the elements of a stream to a single value.
    public void reduce(){
        List<Integer> number = Arrays.asList(2,3,4,5);
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

    }


}
