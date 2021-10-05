
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int confirmpos = 0;
        while (test != 0) {
            int N = sc.nextInt();
            int D = sc.nextInt();
            char[] originalnumber = String.valueOf(N).toCharArray();
//            for(int i=0;i<String.valueOf(N).length();i++){
//                if(String.valueOf(originalnumber[i]).equals(String.valueOf(D))){
//                    System.out.println("Found firdst common element that is "+D+" At position "+i);
//                    confirmpos=i;
//                    System.out.println(tobedelted(confirmpos,originalnumber,N));
//                }
////                System.out.println(originalnumber[i]);
//            }
            System.out.println(tobedelted(getposition(originalnumber,N,D),originalnumber,N));
            test--;
        }
    }

    private static int tobedelted(int confirmpos, char[] originalnumber, int N) {
        String q = "0";
        for (int j = confirmpos; j < String.valueOf(N).length(); j++) {
            q += String.valueOf(originalnumber[j]);
        }
        int result=Integer.parseInt(q);
        return result;
    }

//    private static int deletedfrom(String no){
//        int a=0;
//        for(int k=1;k<no.length();k++){
//
//        }
//
//
//
//        return 0;
//    }

    private static int getposition(char[] originalnumber, int N, int D) {
        for (int i = 0; i < String.valueOf(N).length(); i++) {
            if (String.valueOf(originalnumber[i]).equals(String.valueOf(D))) {
                return i;
            }
        }
        return 0;
    }

}


