import java.util.*;
import java.math.*;


public class Main{
    public static void Menu(){
        System.out.printf("1. Enter all sides' length of the Triangle. \n2. Enter all points of the Triangle.\nPress a number that you want to choose: ");
    }
    public static void main(String[] args){
        double side_1, side_2, side_3;
        double Ax, Ay, Bx, By, Cx, Cy;
        int choice;
        Scanner scan = new Scanner(System.in);

        try {
            Menu();
            choice = scan.nextInt();
            if (choice == 1){
                try{
                    System.out.printf("Enter side a: ");
                    side_1 = scan.nextDouble();
                    System.out.printf("Enter side b: ");
                    side_2 = scan.nextDouble();
                    System.out.printf("Enter side c: ");
                    side_3 = scan.nextDouble();
        
                    Triangle tri = new Triangle(side_1, side_2, side_3);
                    tri.getType();
                    tri.getArea();
                }
                catch(Exception evt){
                    System.out.println("Invalid Input");
                }
            }
            else if (choice == 2){
                try{
                    System.out.printf("Enter a pair x y of point A: ");
                    Ax = scan.nextDouble();
                    Ay = scan.nextDouble();
                    Point point_A = new Point(Ax, Ay);
                    System.out.printf("Enter a pair x y of point B: ");
                    Bx = scan.nextDouble();
                    By = scan.nextDouble();
                    Point point_B = new Point(Bx, By);
                    System.out.printf("Enter a pair x y of point C: ");
                    Cx = scan.nextDouble();
                    Cy = scan.nextDouble();
                    Point point_C = new Point(Cx, Cy);
        
                    side_1 = Math.sqrt( Math.pow(point_A.getX() - point_B.getX(), 2) + Math.pow(point_A.getY() - point_B.getY(), 2) );
                    side_2 = Math.sqrt( Math.pow(point_A.getX() - point_C.getX(), 2) + Math.pow(point_A.getY() - point_C.getY(), 2) );
                    side_3 = Math.sqrt( Math.pow(point_B.getX() - point_C.getX(), 2) + Math.pow(point_B.getY() - point_C.getY(), 2) );
                    Triangle tri = new Triangle(side_1, side_2, side_3);
                    tri.getType();
                }
                catch(Exception evt){
                    System.out.println("Invalid Input");
                }
            }
            else{
                System.out.println("Invalid Input");
            }
           
        }
        catch(Exception evt){
            System.out.println("Invalid Input");
        }
    }
}