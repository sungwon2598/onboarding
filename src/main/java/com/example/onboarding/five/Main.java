package com.example.onboarding.five;

import java.util.Arrays;

public class Main {
    public static void main(String []args){
        int money = 15000;
        System.out.println(Arrays.toString(solution(money)));
    }
    public static int[] solution(int money){
        int result[] = new int[9];
        while (money!=0) {
            while (money >= 50000) {
                money = money - 50000;
                result[0]++;
            }
            while (money >= 10000) {
                money = money - 10000;
                result[1]++;
            }
            while (money >= 5000) {
                money = money - 5000;
                result[2]++;
            }
            while (money >= 1000) {
                money = money - 1000;
                result[3]++;
            }
            while (money >= 500) {
                money = money - 500;
                result[4]++;
            }
            while (money >= 100) {
                money = money - 100;
                result[5]++;
            }
            while (money >= 50) {
                money = money - 50;
                result[6]++;
            }
            while (money >= 10) {
                money = money - 10;
                result[7]++;
            }
            while (money >= 1) {
                money = money - 1;
                result[8]++;
            }
        }
        return result;
    }
}
