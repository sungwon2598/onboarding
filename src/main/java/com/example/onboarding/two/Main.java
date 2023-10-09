package com.example.onboarding.two;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String cryptogram = "zyelleyz";
        System.out.println(solution(cryptogram));
    }

    public static String solution(String cryptogram) {
        String[] cry = cryptogram.split("");

        ArrayList<String> crylist= new ArrayList<>();
        for (int i = 0; i < cry.length; i++) {
            crylist.add(cry[i]);
        }

        while (true) {
            int cnt=0;
            for (int i = 0; i < crylist.size()-1; i++) {
                if(crylist.get(i).equals(crylist.get(i+1))){
                    crylist.remove(i);
                    crylist.remove(i);
                    cnt++;
                }
            }
            if (cnt==0) break;
        }
        String solution ="";
        for (int i = 0; i < crylist.size(); i++) {
            solution = solution+ crylist.get(i);
        }

        return solution.toString();
    }

}
