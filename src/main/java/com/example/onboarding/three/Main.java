package com.example.onboarding.three;

public class Main {
    public static void main(String []args){
        int number = 33;
        System.out.println(solution(number));
    }
    public static int solution(int number){
        int cnt=0;
        for (int i = 1; i <= number; i++) {
            int n=i;
            while(n!=0){
               int a=n%10;
                if(a==3 || a==6 || a==9) cnt++;
                n=n/10;
            }
        }
        return cnt;
    }

}
