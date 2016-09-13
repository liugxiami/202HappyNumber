package com.ccsi;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    //Write an algorithm to determine if a number is "Happy".
    //A happy number is a number defined by the following process: starting with any positive
    //integer,replace the number by the sum of the squares of its digits. and repeat the process
    //until the number equals 1(where it will stay).or it loops endlessly in a cycle which
    //does not include 1. Those numbers for which this process ends in 1 are happy numbes.
    public static boolean isHappy(int n){
        Set<Integer> set=new HashSet<>();
        while(true){
            if(n==1)return true;
            if(!set.add(n)) return false;
            int next=0;
            while(n!=0){
                next+=(n%10)*(n%10);               //记录平方和
                n/=10;
            }
            n=next;
        }
    }
}
