package Desafios;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class O_Despertar_da_Força {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String saida = "";
        
        System.out.println("Informe a posição X de Luke Skywalker: ");
        int lukeX = ent.nextInt();
        System.out.println("Informe a posição Y de Luke Skywalker: ");
        int lukeY = ent.nextInt();
        while (lukeX < 0 || lukeY < 0) {
            System.out.println(
                "As coordenadas não podem ser negativas! \n"
              + "Insira novamente: <lukeX>");
            lukeX = ent.nextInt();
            System.out.println("<lukeY>: ");
            lukeY = ent.nextInt();
        }
        while (lukeX > 19 || lukeY > 49) {
            System.out.println("O limite para as coordenadas de X é 19 e Y é 49"
                    + "Insira novamente: <lukeX>");
            lukeX = ent.nextInt();
            System.out.println("<lukeY>: ");
            lukeY = ent.nextInt();
        }
        
        System.out.println("Informe a posição X de Rey: ");
        int reyX = ent.nextInt();
        System.out.println("Informe a posição Y de Rey: ");
        int reyY = ent.nextInt();
        while (reyX < 0 || reyY < 0) {
            System.out.println(
                "As coordenadas não podem ser negativas! \n"
              + "Insira novamente: <reyX>");
            reyX = ent.nextInt();
            System.out.println("<reyY>: ");
            reyY = ent.nextInt();
        }
        while (reyX > 19 || reyY > 49) {
            System.out.println("O limite para as coordenadas de X é 19 e Y é 49"
                    + "Insira novamente: <reyX>");
            reyX = ent.nextInt();
            System.out.println("<reyY>: ");
            reyY = ent.nextInt();
        }
        
        if (lukeX == reyX && lukeY == reyY) {
            saida = "Ambos estão no mesmo lugar!";
        }
        
        String[] gridLin = new String[20];
        String[] gridCol = new String[50];
        for (int posLin = 0; posLin < gridLin.length; posLin++) {
            for (int posCol = 0; posCol < gridCol.length; posCol++) {
                if (posLin == lukeX && posCol == lukeY) {
                    System.out.print("L|");
                }
                if (posLin == reyX && posCol == reyY) {
                    System.out.print("R|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
        
        System.out.println(saida);
    }
}