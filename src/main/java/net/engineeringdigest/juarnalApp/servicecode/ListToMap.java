package net.engineeringdigest.juarnalApp.servicecode;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String arg []){

        List<String> list = List.of("apple","banana","cherry");

        Map<String,Integer> result;

        result=list.stream().collect(Collectors.
                toMap(Value -> Value,Value->Value.length()));
        System.out.println("Value in LIST "+list);
        System.out.println("Now value in MAP "+result);
    }
}
