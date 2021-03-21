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
public class LinesProgramm {
    public LinesProgramm (){ }
    
    public void task1 (int a, double b, int c){       
        System.out.println("Task 1"); 
        
        double z = 0;
        
        z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z );
    }
    
    public void task2 (double a, double b, double c){       
        System.out.println("Task 2");
        double bQ = Math.pow(b, 2);
        
        if (a == 0){
            System.out.println("a <> 0");
        }
        else if (bQ + 4*a*c < 0){
            System.out.println("b^2 + 4*a*c must be > 0");
        }
        else {
            double z = 0;        
            z = (b + Math.sqrt(bQ + 4*a*c))/(2*a) 
                        - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println("z = " + z);
        }
    }
    
    public void task3 (double x, double y){
        System.out.println("Task 3");        

        double sinX = Math.sin(x);
        double sinY = Math.sin(y);
        double cosX = Math.cos(x);
        double cosY = Math.cos(y);
        double cosXY = Math.cos(x*y);
        double tgXY = Math.tan(x*y);
        
        if (cosXY == 0){
            System.out.println("cos x*y <> 0");
        }
        else if (cosX - sinY == 0){
            System.out.println("cosX - sinY <> 0");
        }
        else {
            double z = ((sinX + cosY)/(cosX - sinY)) * tgXY;
            System.out.println("z = " + z);
        }       
    }
    
    public void task4 (double x){
        System.out.println("Task 4");
        StringBuilder sb = new StringBuilder();
        
        String sub = "" + x;
        int index = sub.indexOf('.');
        
        if (index == 3){
            if (index != -1){
                sb.append(sub.substring(index + 1));
                sb.append ('.');
                sb.append(sub.substring(0, index));
                x = Double.parseDouble(sb.toString());
                System.out.println(x);
            } 
            else {
                sb.append(sub.substring(index + 1));
                sb.append (',');
                sb.append(sub.substring(0, index));
                x = Double.parseDouble(sb.toString());
                System.out.println(x);
            }
        }
        else {
            System.out.println("Введите дробное число 'XXX,YYY' напирмер: 327,942");
        }             
    }
    
    public void task5 (int t){
        System.out.println("Task 5");
        int h = t / 3600;
        int m = (t - h * 3600)/60;
        int s = t - h * 3600 - m * 60;
        System.out.println("Значение: " + t + " = " +
                h + " ч. " + m + " мин. " + s + " c."  );                            
    }
    
    
    public void task6 (int x, int y){
        System.out.println("Task 6");
        
        if (y > 0 && y <=4 && Math.abs(x) <= 2){
            System.out.println("Точка: (" + x + ", " + y + ") входит в фигуру");
        }
        else if (y <= 0 && y >= -3 && Math.abs(x) <= 4){
            System.out.println("Точка: (" + x + ", " + y + ") входит в фигуру");
        }
        else {
            System.out.println("Не входит");
        }
    }
}
    

