package com.brizelab.linecomparisin;
import java.util.Scanner;
public class LineComparisonProblem {
    public static void calculatelength(int x1,int y1,int x2,int y2){
        double length= Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        System.out.println(length);
    }
        public static void main(String[] args) {
            System.out.println("Enter x1-coordinate ");
            Scanner scan = new Scanner(System.in);
            int x1 = scan.nextInt();
            System.out.println("Enter y1-coordinate ");
            int y1 = scan.nextInt();
            System.out.println("Enter x2-coordinate");
            int x2 = scan.nextInt();
            System.out.println("Enter y2-coordinate");
            int y2 = scan.nextInt();

            calculatelength(x1,y1,x2,y2);


        }
    }

