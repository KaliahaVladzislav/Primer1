/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basics;
import static java.lang.Math.*;
/**
 *
 * @author Владислав
 */
public class Branching {
    public Branching (){}
    
    public void task1 (int a, int b){       
        System.out.println("Task 1"); 
        int sum = a + b;
        
        if (sum < 180 && a > 0 && b > 0){
            if (a == 90 || b == 90 || sum == 90 ){
                System.out.println("Треугольник существует и он прямоугольный");
            }
            else {
                System.out.println("Треугольник существует. Он не прямоугольный");
            }
        }
        else {
            System.out.println("Треугольник не существует");
        }
    }
    
    private int min (int a, int b){
        if (a <= b){
            return a;
        }
        else {
            return b;
        }
    }
    
    public void task2 (int a, int b, int c, int d){       
        System.out.println("Task 2"); 
        
        int minAB = min(a, b);
        int minCD = min(c, d);
        
        if (minAB >= minCD){
            System.out.println(minAB);
        }
        else {
            System.out.println(minCD);
        }
    }
    
    public void task3 (int x1, int y1, int x2, int y2, int x3, int y3){ 
        System.out.println("Task 3");
        
        if (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1){
            System.out.println("Лежат на одной линии");
        }
        else {
            System.out.println("Не лежат на одной линии");
        }
    }
    
    public void task4 (int A, int B, int x, int y, int z){
        System.out.println("Task 4");
        
        if (x <= A && y <= B || y <= A && x <= B ||
            x <= A && z <= B || z <= A && x <= B ||
            z <= A && y <= B || y <= A && z <= B)
            {
            System.out.println("Кирпич пройдёт");
        }
        else {
            System.out.println("Кирпич не пройдёт");
        }
    }
    
    public void task5 (int x){
        System.out.println("Task 5");
        
        double y = 0;
        if (x <= 3){
            y = Math.sqrt(x) - 3 * x + 9;
        }
        else {
            y = 1 / (Math.pow(x, 1/3) + 6);
        }
        
        System.out.println(y);
    }
    
}
