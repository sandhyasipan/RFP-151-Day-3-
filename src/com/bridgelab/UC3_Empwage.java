package com.bridgelab;

public class UC3_Empwage {
    public static void main(String[] args) {
        int is_parttime= 1;
        int is_fullpart= 2;
        int emp_rateperhour= 20;
        int emphour= 0;
        int empwage= 0;
        int emptype = (int) (Math.random() * 10 ) % 3;
        if (emptype == is_parttime)
            emphour = 4;
        else if (emptype == n is_fulltime)
            emphour = 8;
        else
            emphour = 0;
        empwage = emphour * emp_rateperhour;
        System.out.println("empwage: " + empwage);
    }
}
