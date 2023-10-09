package com.example.onboarding.one;

public class Main {
    public static void main(String[]args){
        String pobi[] = {String.valueOf(131), String.valueOf(132)};
        String crong[] = {String.valueOf(210), String.valueOf(212)};
        System.out.println(solution(pobi,crong));
    }
    public static int solution(String [] pobi, String [] crong){
        int pobi1 = Integer.parseInt(pobi[0]);
        int pobi2 = Integer.parseInt(pobi[1]);
        int crong1 = Integer.parseInt(crong[0]);
        int crong2 = Integer.parseInt(crong[1]);

        int pobiLeftMax = Math.max(sum(pobi1),gob(pobi1));
        int pobiRightMax = Math.max(sum(pobi2),gob(pobi2));
        int pobiMax = Math.max(pobiLeftMax,pobiRightMax);

        int crongLeftMax = Math.max(sum(crong1),gob(crong1));
        int crongRigthMax = Math.max(sum(crong2),gob(crong2));
        int crongMax = Math.max(crongLeftMax, crongRigthMax);

        int max = Math.max(crongMax,pobiMax);
        if(pobi2-pobi1!=1 || crong2-crong1!=1) return -1;
        else {
            if (max == crongMax && max == pobiMax) return 0;
            if (max == crongMax && max != pobiMax) return 2;
            else return 1;
        }
    }
    public static int sum(int a){
        int sum = 0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
    public static int gob(int a){
        int gob = 1;
        while(a>0){
            gob*=a%10;
            a/=10;
        }
        return gob;
    }
}
