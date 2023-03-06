package org.example;

import java.util.Arrays;
import java.util.*;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class TexunaMainClass {
    public static void main(String arg[])
    {
        int[] intarray=new int[]{2,5,7,9,10,69};
        OptionalInt maxValue= Arrays.stream(intarray).filter(num->num>5).min();
        System.out.println(maxValue.getAsInt());

        String value="developer";
        Long count=Arrays.stream(value.split("")).filter(e->e.equals("e")).count();
        System.out.println(count);

      Map<String,Long> charCount=Arrays.stream(value.split("")).collect(Collectors.groupingBy(s->s,HashMap::new,Collectors.counting()));
        charCount.entrySet().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
    }
}
