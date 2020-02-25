import java.util.Scanner;

public class GiaiThua {
    public static long factorial(int N){
        if (N <= 1){
            return 1;
        }else{
            return N * factorial(N-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập số giai thừa cần tính");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long fact = factorial(N);
        System.out.println("Kết quả là: " + fact);
    }
}
