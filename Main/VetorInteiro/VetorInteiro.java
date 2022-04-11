package Main.VetorInteiro;

import java.util.Scanner;

public class VetorInteiro{
    static Scanner s = new Scanner(System.in);
    
    public static void validarNum(int x) throws NumberFormatException{
        if (!isStringInteger(toString(x), 10)) {
            throw new NumberFormatException();
        }else{
            System.out.println("Numero aceito");
        } 
    }
    
    public static boolean isStringInteger(String stringToCheck, int radix) {
        Scanner sc = new Scanner(stringToCheck.trim());
        if(!sc.hasNextInt(radix)){
            return false;
        }
        sc.nextInt(radix);
        return !sc.hasNext();
    }
    
    public static void validarIndice(int y) throws ArrayIndexOutOfBoundsException{
        if (y < 0 || y > 9) {
            throw new ArrayIndexOutOfBoundsException(); 
        }else{
            System.out.println("Indice aceito");
        }
    }
    
    public static boolean stop(Integer [] vetor){
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                count++;
            }
        }
        return count == vetor.length;
    }
    
    public static void main(String[] args) {
        Integer [] vetor = new Integer[10];
        boolean stop;
        do{
            int x, y;
            System.out.println("Informe o valor que será colocado no vetor");
            x = s.nextInt();
            try {
                validarNum(x);                   
            } catch (NumberFormatException ex) {
                System.out.println(ex);
            }
            System.out.println("Informe o indice no qual o valor será colocado");
            y = s.nextInt();
            try {
                validarIndice(y);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex);
            }
            vetor[y] = x;
            stop = stop(vetor);
        }while(stop != true);
    }
    
    public static String toString(int x){
        return "" + x;
    }
}
