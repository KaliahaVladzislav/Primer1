/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basics;
import static java.lang.Math.*;
import java.util.*;
/**
 *
 * @author Владислав
 */
public class Loops {
    public Loops (){}
    
    public void task1(){
        System.out.println("Task 1");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        
        int x = scanner.nextInt();
        int sum = 0;
        if (x > 0 && x % 2 == 0){            
            for (int i = 0; i < x; i++){
                sum += i;
            }           
            System.out.println(sum);
        }
        else {
            System.out.println("Вы ввели неверное значение");
        }

    }
    
    public void task2(){
        System.out.println("Task 2");
        int y;
        
        int a = -5;
        int b = 5;
        int h = 1;
        for (int x = a; x <= b - h; x += h){
            if (x > 2){
                y = x;
                System.out.println("x = " + x + " y = " + y);
            }
            else {
                y = -1* x;
                System.out.println("x = " + x + " y = " + y);
            }
        }
        
    }
    
    public void task3(){
        System.out.println("Task 3");
        int sum = 0;
        
        for (int i = 1; i <= 100; i++){
            sum += i*i;
        }
        System.out.println(sum);
    }
    
    public void task4(){
        System.out.println("Task 4");
        int proiz = 1;
        
        for (int i = 1; i <= 4; i++){
            proiz *= i*i;
        } 
        System.out.println(proiz);
    }
    
    public void task5(double e, int n){
        System.out.println("Task 5");
        double sum = 1;
        double an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
        sum = an;
        while (Math.abs(an) >= e){
            System.out.println(an);
            n++;
            an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            sum += an;
        }
        
        System.out.println(sum);
    }
    
    public void task6(){
        
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }

        System.out.println();
    }
    
    public void task7(){
        System.out.println("Task 7");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число 1");        
        int m = scanner.nextInt();
        System.out.println("Введите натуральное число 2"); 
        int n = scanner.nextInt();
        
        for (int i = m; i <= n; i++){
            System.out.print ("Число " + i + " в промежутке от " + m + " до " + n + " делится на: ");
            for (int k = 2; k < i; k++){
                if (i % k == 0){
                    System.out.print ( k + " ");
                }
            }
            System.out.println();            
        }
    }
    public ArrayList<Integer> arrayInt (int a){

        ArrayList<Integer> array = new ArrayList<Integer>();
        
        while(a > 0){
            int i = 0;
            array.add(i, a % 10);
            a = a / 10;
            i++;
        }
        return array;
    }
    public void task8(int a, int b){
        System.out.println("Task 8");
        ArrayList<Integer> arrA = arrayInt(a);
        ArrayList<Integer> arrB = arrayInt(b);
        ArrayList<Integer> Anew = new ArrayList<Integer>();
        
        for(int i : arrA){
            if (arrB.contains(i) && !Anew.contains(i)){
                Anew.add(i);
                System.out.print (i + " ");
            } 
        }
        
    }
    
    
}
