package com.udemy.dates;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }
    int noOfWays(int n, int k, List<Integer> currency){

        List<Integer> sum=new ArrayList<>();
        currency.stream().forEach(i-> sum.add(i+sum.get(sum.size()-1)));

        int count=0;

        for(int i=0;i<currency.size();i++)
        {

        }

        return 0;
    }
}
