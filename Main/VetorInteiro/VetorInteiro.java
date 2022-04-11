package Main.VetorInteiro;

import java.util.Scanner; 
public class VetorInteiro { 
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);  
        int [] vetor  =  new int[10];  
        try { 
            for(int i=0; i < vetor.length; i++){
                System.out.println("Digite o indice que deseja inserir o valor:");
                i = s.nextInt(); 
                System.out.println("Digite o valor:");
                vetor[i] = s.nextInt();
            } 
        } catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println("Posição inexistente"); 
            System.out.println(e); 
        } catch(NumberFormatException c){
            System.out.println(c.getMessage()+"O valor deve ser um numero");
            System.out.println(c); 
        } finally{
            System.out.println("Fim");
        }
    } 
}
