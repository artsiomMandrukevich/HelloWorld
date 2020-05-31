package com.company;

public class FirstChapter {

    String TestVariable = "My Test, Hello World";
    Integer in = 1;
    Integer iif = 90;
    char grade = 0;

    public void HeloWorld(){
        System.out.println(TestVariable.replace("My Test", "Artem"));
    }

    public void WhileTest(){
        while(in < 11){
            System.out.println(TestVariable.replace("My Test", "Artem") + " " + in + " " + "count while");
            ++in;
        }
    }

    public void ForTest(){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int item : numbers){
            System.out.println(TestVariable.replace("My Test", "Artem") + " " + item + " " + "count For");
        }
        for(int i = 1; i < 11; ++i){
            System.out.println(TestVariable.replace("My Test", "Artem") + " " + i + " " + "count For 2");
        }
    }

    public void IfTest(){
        if (iif < 90){
            grade = 'A';
        }else if (iif == 90){
            grade = 'B';
        }else if (iif > 90){
            grade = 'C';
        }
        System.out.println("If Test: Grade = " + grade);
    }

    public void SwitchTest(){
        switch (iif){
            case 89:
                System.out.println("Switch test: A " + grade);
                break;
            case 90:
                System.out.println("Switch test: B " + grade);
                break;
            case 91:
                System.out.println("Switch test: C " + grade);
                break;
        }

    }
}
