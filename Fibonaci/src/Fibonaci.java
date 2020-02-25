public class Fibonaci {
    public static int checkFibonaci(int n){
        if (n<0){
            return -1;
        }else if (n == 0 || n == 1){
            return n;
        }else{
            return checkFibonaci(n-1) + checkFibonaci(n-2);
        }
    }
}
