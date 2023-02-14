package com.geometry;

import java.util.Objects;
import java.util.Scanner;

public class LineComparison {
    //method creation
    public double calculationOfLengthOne(double x1,double y1,double x2,double y2) {
        double length1= Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        return length1;
    }
    public double calculationPartOfLengthTwo(double x3,double y3,double x4,double y4){
        double length2 = Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));
        return length2;
    }
    public static void main(String[] args) {
        LineComparison  compare = new LineComparison(); // cretion of object
        Scanner scanner = new Scanner(System.in);
        // getting line1 inputs
        System.out.println("Enter the coordinates of line1(x1,y1) value :");
        double x1 =scanner.nextDouble();
        double y1 =scanner.nextDouble();
        System.out.println("Enter the coordinates of line1(y1,y2) value :");
        double x2 =scanner.nextDouble();
        double y2 =scanner.nextDouble();
        //getting line2 inputs
        System.out.println("Enter the coordinates of line2(x3,y3) value :");
        double x3 =scanner.nextDouble();
        double y3 =scanner.nextDouble();
        System.out.println("Enter the coordinates of line2(x4,y4) value :");
        double x4 =scanner.nextDouble();
        double y4=scanner.nextDouble();
        //method calling
       double length1 = compare.calculationOfLengthOne(x1,y1,x2,y2);
        double length2 = compare.calculationPartOfLengthTwo(x3,y3,x4,y4);
        //finding equals
        System.out.println("Is both the lines are Equal?true or false :"+ Objects.equals(length1,length2));
        //compare two lines
        double result =Double.compare(length1,length2);
        if(result == 0){
            System.out.println("The length of a two line are equal");
        }else{
            System.out.println("The length of a two lines are not equal");
        }

    }

}
