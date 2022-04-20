package Desafios;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Relatório_para_Diretoria {
    public static void main(String[] args) {
        
    }
    
    public static String caminhoArquivoDepartamento() {
        Scanner ent = new Scanner(System.in);
        int depID = 1;
        String depNome = "Departamento CTVM", saida = "";
        
        saida = depID+"; "+depNome;
        return saida;
    }
    
    public static String arquivoFuncionarios() {
        Scanner ent = new Scanner(System.in);
        int funID = 1, funSal = 1000, funDepID = 1;
        String funNome = "Rafael", saida = "";
        
        saida = funID+"; "+funNome+"; "+funSal+"; "+funDepID;
        return saida;
    }
    
    public static String relatorio(String caminhoArquivoDepartamento, String caminhoArquivoFuncionarios) {
        String resultado = "";
        
        
        
        return resultado;
    }
}