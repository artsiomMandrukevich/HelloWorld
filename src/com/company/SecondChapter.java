package com.company;

import java.util.Scanner;

public class SecondChapter {

    private String strCalcA = "Input first number: ";
    private String strCalcB = "Input second number: ";
    private int calcA = 0;
    private int calcB = 0;

    StringBuffer s = new StringBuffer("abcd");

    public String getStrCalc(String str){
        return str;
    }

    public int InputNumber(String strNum){
        Scanner in = new Scanner(System.in);
        System.out.println(strNum);
        int num = in.nextInt();
        return num;
    }

    public int Calc(int a, int b){
        int c = a*b;
        return c;
    }

    public void InputCalc(){
        calcA = InputNumber(getStrCalc(strCalcA));
        calcB = InputNumber(getStrCalc(strCalcB));
        System.out.println(calcA + "*" + calcB + "=" + Calc(calcA, calcB));
    }

    public void StringBuffer(){
        System.out.println(s);
        s.append("eee");
        System.out.println(s);
        s.delete(1,3);
        System.out.println(s);
        s.insert(2,'b');
        System.out.println(s);
        s.insert(3,'h');
        System.out.println(s);

        String ans = s.toString();
        System.out.println(ans);
    }



}
