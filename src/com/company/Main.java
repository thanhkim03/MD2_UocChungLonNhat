package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào a ");
        a= scanner.nextInt();
        System.out.println("nhập vào b ");
        b= scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0||b==0){
            System.out.println("lỗi rồi bạn êi");
        }
        while (a !=b){
            if (a>b){
                a -=b;
            }else {
                b -=a;
            }
        }
        System.out.println("Ước chung lớn nhất là : " + a);
    }
}
