package Main.Vetor100;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor100 {

    public static void main(String[] args) throws AcimaDeCemException{
        Scanner s = new Scanner (System.in);
        int sum = 0;
        int countnum = 0;
        try{
            do{
                System.out.println("Insira um numero");
                int x = s.nextInt();
                countnum++;
                sum += x;
                if (sum > 100) {
                    throw new AcimaDeCemException();
                }
                double media = (double) sum / countnum; 
                System.out.println("Soma = " +sum);
                System.out.println("Numeros somados = " + countnum);
                System.out.println("Média = " + media);
            }while(sum <= 100);
        }catch (InputMismatchException e) {
            System.out.println(e);
        } finally{
            System.out.println("FIm");
        }
    }
    
}
