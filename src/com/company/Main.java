package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Дан List<Integer>. Необходимо найти значение элемента максимально близкого к некоторому заданному значению N.
         maxnearest(5);


          /* Дана строка вида ключ1:значение1;ключ2:значение2;ключ1:значение2;ключ3:значение1 ..... Написать метод, который возвращает последнее значение заданного ключа.
            Например: "Jack:room 10;Nick:room 20;Jack:room 1;Mike:room3", "Jack" -> "room 1"
           Если в строке нет заданного ключа возвращается пустая строка.*/
        lastvalue("Nick");


    }

    private static void lastvalue(String FindStr) {
        List<String> list = List.of("Jack:room 10","Nick:room 20","Jack:room 1","Mike:room3","Nick:room 40");
        String FindO = list.stream()
                .reduce((i1,i2) -> {
                    if(  i2.contains(FindStr)  )
                        return i2;
                    else
                        return i1;
                }).orElse(null);

       System.out.println(FindO.substring(FindO.indexOf(":")+1));


    }


    private static void maxnearest(Integer FindNumber) {
        List<Integer> list = List.of(105,20,10,16,17);
        System.out.println(list.stream()
                .reduce((i1,i2) -> {
                    if(  ( (i1-FindNumber)<0 ? -(i1-FindNumber) : (i1-FindNumber) )   > ( (i2-FindNumber)<0 ? -(i2-FindNumber) : (i2-FindNumber) )  )
                        return i2;
                    else
                        return i1;
                }).orElse(null));

    }








}
