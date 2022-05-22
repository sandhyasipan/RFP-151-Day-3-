package com.bridgelab;

public class UC2_Empwage {
    public static void main (String[] args){
        int isfulltime=1;
        int emprateperhour=20;
        int emphour=0;
        int empwage=0;
        int emptype = (int) (Math.random () * 10) % 2;
        if (emptype == isfulltime) {
            emphour = 8;
        }else
            emphour = 0;
            empwage = emphour * emprateperhour;
            System.out.println("empwage: " + empwage);

        }


    }

