import java.util.Scanner;

class HarmonicNumber {
    public static double nHarmonicNumber(int Num) {
       float harmonic =1;
       for (int i=2;i<Num;i++){
           harmonic += (float)1/i;
       }
       return harmonic;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number of Harmonic Number:");
        int number = sc.nextInt();
        System.out.println(nHarmonicNumber(number));
    }
}
