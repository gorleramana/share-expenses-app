package com.rg.ds.javastreams;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamsArray {
    public static void main(String[] args){
        //TODO: Java Streams with Arrays
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        List<Integer> evenNumbers = Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
        
        System.out.println("Even numbers: " + evenNumbers);
    }
}
