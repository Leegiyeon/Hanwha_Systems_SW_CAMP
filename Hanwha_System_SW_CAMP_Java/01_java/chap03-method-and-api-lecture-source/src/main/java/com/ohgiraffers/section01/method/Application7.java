package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {
        /* 수업목표. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다. */
        int first = 20;
        int second = 10;

        Application7 app7 = new Application7();
        System.out.println("두 수를 더한 결과 : " + app7.plusTwoNubers(first, second));
        System.out.println("두 수를 뺀 결과 : " + app7.subTwoNubers(first, second));
        System.out.println("두 수를 곱한 결과 : " + app7.multiTwoNubers(first, second));
        System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNubers(first, second));
    }

    private int plusTwoNubers(int first, int second) {
//        int result = first + second;
//        return result;
        return first + second;
    }

    private int subTwoNubers(int first, int second) {
        return first - second;
    }

    private int multiTwoNubers(int first, int second) {
        return first * second;
    }

    private int divideTwoNubers(int first, int second) {
        return first / second;
    }
}
