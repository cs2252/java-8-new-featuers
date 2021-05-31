package com.udemy.defaults;

import com.udemy.data.Student;
import com.udemy.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample{

    public static void main(String[] args) {


        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Eric", "Mike");

       /* Collections.sort(stringList);

        System.out.println("Sorted list : " +  stringList);
       */

        stringList.sort(Comparator.naturalOrder());

        System.out.println("Sorted list : " +  stringList);

        stringList.sort(Comparator.reverseOrder());

        System.out.println("Reverse Sorted list : " +  stringList);


    }
}
