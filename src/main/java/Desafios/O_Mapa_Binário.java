package Desafios;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class O_Mapa_Binário {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String NBinario = "";
        int intervalo = 0;
        
        System.out.println("Informe o número a ser utilizado: ");
        int N = ent.nextInt();
        while (N <= 0) {
            System.out.println(
                "Não é possível utilizar um número negativo! \n"
              + "Insira novamente: ");
            N = ent.nextInt();
        }
        
        NBinario = intParaBinario(N);
        intervalo = intervaloBinario(NBinario);
        
        System.out.println(intervalo);
    }
    
    public static String intParaBinario(int N) {
        String NBinario = "";
        
        while (N > 0) {
            NBinario = N%2 + NBinario;
            N = N/2;
        }
        
        return NBinario;
    }
    
    public static int intervaloBinario(String NBinario) {
        int intervalo = 0, intervaloMaior = 0, guardaIntervalo = 0;
        String guarda = "";
        
        for (int pos = 0; pos < NBinario.length(); pos++) {
            guarda = Character.toString(NBinario.charAt(pos));
            
            if (guarda.equals("0")) {
                intervalo++;
            } else if (intervalo > 0 && guarda.equals("1")) {
                guardaIntervalo = intervalo;
                
                if (guardaIntervalo > intervaloMaior) {
                    intervaloMaior = guardaIntervalo;
                }
                
                intervalo = 0;
            }
        }
        //537
        //1000011001 
        return intervaloMaior;
    }
}