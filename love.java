package com.ziyong;

import java.util.Random;
import java.util.Scanner;

public class love {
    static void main() {
//        输入行数 a
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("选择：奇数自定义行数，偶数随机行数");
        int sss = sc.nextInt();
        int a;
        if(sss % 2 != 0) {
            System.out.println("请输入行数：");
            a = sc.nextInt();
        }
        else{
            a = r.nextInt(16)+4;
            System.out.println(a);
        }
        int b=a/3;
        int u = a-b;
        if(a>3){
//        判断a是3的倍数，或3的倍数加1，或3的倍数加2，进入相应循环
        if(a%3==0){
            for (int i = 1; i <= b-1; i++) {
//                第一个上三角前的空格
                for (int j = 1; j <= u-i-b+1; j++) {
                    System.out.print("   ");
                }
//                第一个上三角的心号
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print("  ♥");
                }
//                第一个上三角后的空格
                for (int j = 1; j <= b-i-1; j++) {
                    System.out.print("   ");
                }
//                中央空格
                System.out.print("   ");
//                第二个上三角前的空格
                for (int j = 1; j <= b-i-1; j++) {
                    System.out.print("   ");
                }
//                第二个上三角的心号
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print("  ♥");
                }
                System.out.println();
            }
//            特殊行
            int e =(a-b-1)*2-1;
            System.out.print("   ");
            for (int i = 1; i <= e; i++) {
                System.out.print("  ♥");
            }
            System.out.println();
//          打印下半部分的菱形，c表示行数，w表示列数
            int x =a-b;
            for (int c = a-b; c > 0; c--) {
                for(int w = c;w<x;w++){
                    System.out.print("   ");
                }
                for(int w = 1;w<=2*c-1;w++){
                    System.out.print("  ♥");
                }
                System.out.println();
            }
        }
        else if(a%3==1) {
//            打印上半部分的菱形
//            i控制行数，j控制列数
            for (int i = 1; i <= b; i++) {
                for (int j = 1; j <= u-i-b; j++) {
                    System.out.print("   ");
                }
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print("  ♥");
                }
                for (int j = 1; j <= b-i; j++) {
                    System.out.print("   ");
                }
                System.out.print("   ");
                for (int j = 1; j <= b-i; j++) {
                    System.out.print("   ");
                }
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print("  ♥");
                }
            System.out.println();
            }
//          打印下半部分的菱形，c表示行数，w表示列数
            int x =a-b;
            for (int c = a-b; c > 0; c--) {
                for(int w = c;w<x;w++){
                    System.out.print("   ");
                }
                for(int w = 1;w<=2*c-1;w++){
                    System.out.print("  ♥");
                }
                System.out.println();
            }
        }
        else if(a%3==2){
            for (int i = 1; i <= b; i++) {
                for (int j = 1; j <= u-i-b-1; j++) {
                    System.out.print("   ");
                }
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print("  ♥");
                }
                for (int j = 1; j <= b-i; j++) {
                    System.out.print("   ");
                }
                System.out.print("   ");
                for (int j = 1; j <= b-i; j++) {
                    System.out.print("   ");
                }
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print("  ♥");
                }
                System.out.println();
            }
            int x =a-b;
            for(int t =1;t<=(x-1)*2-1;t++){
                System.out.print("  ♥");
            }
            System.out.println();
            for (int c = a-b-1; c > 0; c--) {
                for(int w = c;w<x-1;w++){
                    System.out.print("   ");
                }
                for(int w = 1;w<=2*c-1;w++){
                    System.out.print("  ♥");
                }
                System.out.println();
            }
        }
        }
        else{
            System.out.println("太小了，画不出爱心");
    }
}
}
