package excercisesEasy;

public class primeryNumbers {


    public static void main(String[] args){

        for(int i = 0; i<10000;i++){
            System.out.println(primeNumbers(i));
        }

    }


    public static String primeNumbers(int n){
        String result = "";

        for(int i=2;i<n;i++){
            if (n%i == 0 ){
                result = n + "   NIE";
                break;
            }
            else result = n + "  TAK";
        }

        return result;
    }



}
