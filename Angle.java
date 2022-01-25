import java.util.Scanner;

class Angle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the degree:");
        Double degree = sc.nextDouble();
        double radian = Math.toRadians(degree);
        double sinValue = Math.sin(radian);
        double cosValue = Math.cos(radian);
        System.out.println("sin(" + degree + ") = " + sinValue);
        System.out.println("cos(" + degree + ") = " + cosValue);
    }
}
