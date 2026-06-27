import java.util.Scanner;

public class verify{
    public static boolean numberVerification(int[] cpfInput, int[] Calculation){
        int sum = 0;
        for(int i = 0; i < Calculation.length; i++){
            sum += (cpfInput[i] * Calculation[i]);
        }
        sum%=11;
        int derick = 11 - sum;
        if (derick >= 10){
            derick = 0;
        }
             return derick == cpfInput[Calculation.length];
        }
    public static void main(String[] args) {
        final int[] firstOcorrency = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        final int[] secOcorrency = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        Scanner scan = new Scanner(System.in);
        String numImput = "";
        do{
            System.out.println("Insira seu CPF: ");
            numImput = scan.nextLine();
            }while(!numImput.matches("[0-9]{11}"));
        System.out.println("CPF: "+numImput);
        int[] verificationArray  =  new int[numImput.length()];
        for(int i=0; i < numImput.length(); i++ ){
            verificationArray[i] = Character.getNumericValue(numImput.charAt(i));
        }
        boolean one = numberVerification(verificationArray, firstOcorrency);
        boolean two = numberVerification(verificationArray, secOcorrency);

        if (one && two){
            System.out.println("Esse CPF existe");
        }
        else{
            System.out.println("Esse CPF nao existe");
        }
    }
}