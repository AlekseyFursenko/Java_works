import java.util.Scanner;

public class trngl_nmbrs {
    public static void main(String[] args) {
        int n = input();
        int b = triangle(n);
        System.out.println("The " + n + "-th element of triangular numbers is " + b);
    }
    
    public static int triangle(int n) {
        int t_n = n * (n + 1) / 2;
        return t_n;            
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of element of triangular numbers: ");
        int num = in.nextInt();
        in.close();
        return num;
    }
}
