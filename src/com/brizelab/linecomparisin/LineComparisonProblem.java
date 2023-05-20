package com.brizelab.linecomparisin;
import java.util.Scanner;
public class LineComparisonProblem {
    public static void calculatelength(int x1,int y1,int x2,int y2,int p1,int q1,int p2,int q2){
        double length1= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double length2= Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
        String s=String.valueOf(length1);
        String s2=String.valueOf(length2);
        if(s.equals(s2)){
            System.out.println("length1 and length2 are equals");
        }
        else
        {
            System.out.println("length1 and length2 are not equals");
        }
        }
        public static void compareToMethod(int x1,int y1,int x2,int y2,int p1,int q1,int p2,int q2){
            double length1= Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
            double length2= Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
            String s=String.valueOf(length1);
            String s2=String.valueOf(length2);
            System.out.println(s.compareTo(s2));
        }
        public static void main(String[] args) {
            System.out.println("Enter line one coordinate");
            System.out.println("Enter x1-coordinate ");
            Scanner scan = new Scanner(System.in);
            int x1 = scan.nextInt();
            System.out.println("Enter y1-coordinate ");
            int y1 = scan.nextInt();
            System.out.println("Enter x2-coordinate");
            int x2 = scan.nextInt();
            System.out.println("Enter y2-coordinate");
            int y2 = scan.nextInt();
            System.out.println("Enter line second coordinate");
            System.out.println("Enter p1-coordinate ");
            int p1 = scan.nextInt();
            System.out.println("Enter q1-coordinate ");
            int q1 = scan.nextInt();
            System.out.println("Enter p2-coordinate");
            int p2 = scan.nextInt();
            System.out.println("Enter q2-coordinate");
            int q2 = scan.nextInt();

            calculatelength(x1,y1,x2,y2,p1,q1,p2,q2);
            compareToMethod(x1,y1,x2,y2,p1,q1,p2,q2);


        }
    }

