import javax.print.DocFlavor;

import static java.lang.Integer.parseInt;

public class FizzBuzz {
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String KHONG = "không";
    public static final String MOT = "một";
    public static final String HAI = "hai";
    public static final String BA = "ba";
    public static final String BON = "bốn";
    public static final String NAM = "năm";
    public static final String SAU = "sáu";
    public static final String BAY = "bảy";
    public static final String TAM = "tám";
    public static final String CHIN = "chín";

//    public static void main(String[] args) {
//        for (int i=0;i<100;i++){
//            System.out.println(checkNumber(i) + '\t');
//        }
//    }

    public static String checkFizzBuzz(int num){
        boolean divisionFiveAndThree = num % 5 == 0 && num % 3 == 0;
        boolean divisionThree = num % 3 == 0;
        boolean divisionFive = num % 5 == 0;

        if (divisionFiveAndThree){
            return FIZZ_BUZZ;
        }else{
            if (divisionThree) {
                return FIZZ;
            }else {

                if (divisionFive){
                    return BUZZ;
                }
            }
        }
        return String.valueOf(num);
    }

//    public static String displayList(int num) {
//        String result = "";
//        if (num > 0 && num < 100) {
//            result = checkFizzBuzz(num);
//            return result;
//        } else
//        return "invalid";
//    }

    public static String checkNumber(int num){
        String result;
        result = checkFizzBuzz(num);

//        int number = Integer.parseInt(result);
        int hangChuc = num / 10;
        int donVi = num % 10;
        if (hangChuc == 3 || donVi == 3){
            return FIZZ;
        }else if (hangChuc == 5 || donVi == 5){
            return BUZZ;
        }else{
            return String.valueOf(num);
        }
    }

    public static String readDonVi(int num) {
        int donVi = num % 10;
            switch (donVi) {
                case 0:
                    return KHONG;
                case 1:
                    return MOT;
                case 2:
                    return HAI;
                case 3:
                    return BA;
                case 4:
                    return BON;
                case 5:
                    return NAM;
                case 6:
                    return SAU;
                case 7:
                    return BAY;
                case 8:
                    return TAM;
                case 9:
                    return CHIN;
        }
        return "";
    }

    public static String readNumber(int num){
        int hangChuc = num / 10;
        int donVi = num % 10;
        switch (hangChuc){
            case 1:
                return MOT + " " + readDonVi(donVi);
            case 2:
                return HAI + " " + readDonVi(donVi);
            case 3:
                return BA + " " + readDonVi(donVi);
            case 4:
                return BON + " " + readDonVi(donVi);
            case 5:
                return NAM + " " + readDonVi(donVi);
            case 6:
                return SAU + " " + readDonVi(donVi);
            case 7:
                return BAY + " " + readDonVi(donVi);
            case 8:
                return TAM + " " + readDonVi(donVi);
            case 9:
                return CHIN + " " + readDonVi(donVi);
        }
        return "";
    }
}
