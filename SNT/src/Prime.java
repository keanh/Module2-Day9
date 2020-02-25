public class Prime {
    public static boolean isPrime(int number, int i){
        if (number <= 2)
            return (number == 2) ? true : false;
        if (number % i == 0)
            return false;
        if (i * i > number)
            return true;
        return isPrime(number,i+1);
    }

    public static int findValue(int index) {
        int count = 1;
        int number = 2;
        while (count <= index){
            if (isPrime(number,2)){
                if (index == count){
                    return number;
                }
                count++;
            }
            number++;
        }
        return -1;
    }
}
