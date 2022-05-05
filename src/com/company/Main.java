package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int at= scanner.nextInt();
        int a=0;
        for (int i = 1; i <= at; i++) {
            a+=i;
            if (i==at){
                System.out.print(i+"="+a);
            }else{
                System.out.print(i+"+");
            }
        }
    }
}
