package com.udemy;

import com.udemy.lambda.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here


        new ArrayList<String>(Arrays.asList(new String[]{"dfdf", "fdfd"})).forEach(str-> System.out.println(str));

        for(String str: new HashMap<String,String>().keySet()){
            System.out.println(str);
        }

    }
}
