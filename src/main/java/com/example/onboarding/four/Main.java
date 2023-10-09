package com.example.onboarding.four;

public class Main {
    public static void main(String[]args){
        String word = "I 23love you";
        System.out.println(solution(word));
    }
    public static String solution(String word){
        String result = "";
        char[] c = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            c[i] = word.charAt(i);
        }
        for (int i = 0; i < c.length; i++) {
            if((int)'a'<=(int)c[i] && (int)c[i]<=(int)'z'){
                result+=Character.toString('z'-c[i]+'a');
            }else if((int)c[i]==37){
                result+=" ";
            } else if((int)'A'<=(int)c[i] && (int)c[i]<=(int)'Z'){
                result+=Character.toString('Z'-c[i]+'A');
            } else {
                result+=c[i];
            }
        }
        return result;
    }
}
