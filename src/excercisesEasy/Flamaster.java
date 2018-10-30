package excercisesEasy;

public class Flamaster {

    public static void main(String[] args){
        String x= "AACD";
        String[] tab = new String[3];
        tab = x.split("");

        for(int i = 0; i<tab.length;i++ ){
            System.out.println(tab[i]);
            if ((tab[i].compareTo(tab[i+1]))==0){
                System.out.println("rowne");
            }
        }
    }

    public static String codeString(String input){
        String inputString = input;
        String[] stringArray = inputString.split("");
        String outputString = "";
        int letterCounter = 0;
        String compar = stringArray[0];
        outputString=outputString+compar;

        for(int i=1;i<stringArray.length;i++){
            if(compar.compareTo(stringArray[i])==0){
                letterCounter++;
            }

        }


     return outputString;
    }
}
