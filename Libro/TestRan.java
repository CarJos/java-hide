import java.util.Scanner;

public class TestRan {
    public static void main(String[] args) {
        // int dado = 0, sum = 0;
        // for (int i = 0; i < 3; i++) {
        //     long valor;
        //     valor = Math.round(Math.random() * 6) + 1; 
        //     dado++;
        //     sum += valor;
        //     System.out.println("Dado "+ dado + ": " + valor);
        // }
        // System.out.println("Suma dados: " + sum);
        // -----------------------------------------------
        // -----------------------------------------------
        // int valor = (int)Math.round(Math.random() * 13) + 1;
        // int palos = (int)Math.round(Math.random() * 3);
        // switch (valor) {
        //     case 1:
        //         System.out.print("As de ");
        //         break;
        //     case 2:
        //         System.out.print("2 de ");
        //         break;
        //     case 3:
        //         System.out.print("3 de ");
        //         break;
        //     case 4:
        //         System.out.print("4 de ");
        //         break;
        //     case 5:
        //         System.out.print("5 de ");
        //         break;
        //     case 6:
        //         System.out.print("6 de ");
        //         break;
        //     case 7:
        //         System.out.print("7 de ");
        //         break;
        //     case 8:
        //         System.out.print("8 de ");
        //         break;
        //     case 9:
        //         System.out.print("9 de ");
        //         break;
        //     case 10:
        //         System.out.print("10 de ");
        //         break;
        //     case 11:
        //         System.out.print("J de ");
        //         break;
        //     case 12:
        //         System.out.print("Q de ");
        //         break;
        //     case 13:
        //         System.out.print("K de ");
        //         break;
        //     default:
        //         break;
        // }
        // switch (palos) {
        //     case 0:
        //         System.out.println("picas");
        //         break;
        //     case 1:
        //         System.out.println("corazones");
        //         break;
        //     case 2:
        //         System.out.println("diamantes");
        //         break;
        //     case 3:
        //         System.out.println("treboles");
        //         break;
        //     default:
        //         break;
        // }
        // -----------------------------------------------
        // -----------------------------------------------
        // for (int i = 0; i < 20; i++) {
        //     System.out.print(Math.round(Math.random() * 10) + " ");
        // }
        // -----------------------------------------------
        // -----------------------------------------------
        // for (int i = 0; i < 200; i++) {
        //         System.out.print((Math.round(Math.random() * 99) + 100) + " ");
        //     }
        // -----------------------------------------------
        // -----------------------------------------------
        // int comb, tries = 5, pass;
        // comb = (int)Math.round(Math.random() * 100);
        // Scanner sc = new Scanner(System.in);
        // while (tries > 0) {
        //     System.out.print("Ingrese un numero entre 0 y 100: ");
        //     pass = sc.nextInt();
        //     if (pass != comb) {
        //         tries--;
        //         System.out.println("Quedan " + tries + " intentos");
        //         if (pass > comb) {
        //             System.out.println("El numero ingresado es mayor que la clave");
        //         } else {
        //             System.out.println("El numero ingresado es menor que la clave");
        //         }
        //     } else {
        //         System.out.println("Correcto! Adivinaste!");
        //         break;
        //     }
        // }
        // if (tries == 0) {
        //     System.out.println("No adivinaste la clave que era " + comb);
        // }
        // -----------------------------------------------
        // -----------------------------------------------
        // int num = -1, cont = 0;
        // while (num < 101) {
        //     num = (int)Math.round(Math.random() * 100);
        //     if (num % 2 ==0) {
        //         System.out.print(num + " ");
        //         cont++;
        //     }
        //     if (num == 24) {
        //         break;
        //     }
        // }
        // System.out.println("\nHan sido " + cont + " numeros");
        // -----------------------------------------------
        // -----------------------------------------------
        // int num, sus = 0, suf = 0, bien = 0, notable = 0, sobre = 0;
        // for (int i = 0; i < 20; i++) {
        //     num = (int)Math.round(Math.random() * 4);
        //     switch (num) {
        //         case 0:
        //             System.out.print("Suspenso ");
        //             sus++;
        //             break;
        //         case 1:
        //             System.out.print("Suficiente ");
        //             suf++;
        //             break;
        //         case 2:
        //             System.out.print("Bien ");
        //             bien++;
        //             break;
        //         case 3:
        //             System.out.print("Notable ");
        //             notable++;
        //             break;
        //         case 4:
        //             System.out.print("Sobresaliente ");
        //             sobre++;
        //             break;
        //         default:
        //             break;
        //     }    
        // }
        // System.out.println("\nSuspenso: " + sus);
        // System.out.println("Suficiente: " + suf);
        // System.out.println("Bien: " + bien);
        // System.out.println("Notable: " + notable);
        // System.out.println("Sobresaliente: " + sobre);
        // -----------------------------------------------
        // -----------------------------------------------
        // comprobar que la ultima sea identica a la primera
        // int num, qty;
        // qty = (int)Math.round(Math.random() * 7);
        // for (int i = 0; i < qty; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         num = (int)Math.round(Math.random() * 4);
        //         switch (num) {
        //             case 0:
        //                 System.out.print("do ");
        //                 break;
        //             case 1:
        //                 System.out.print("re ");
        //                 break;
        //             case 2:
        //                 System.out.print("mi ");
        //                 break;
        //             case 3:
        //                 System.out.print("fa ");
        //                 break;
        //             case 4:
        //                 System.out.print("sol ");
        //                 break;
        //             case 5:
        //                 System.out.print("la ");
        //                 break;
        //             case 6:
        //                 System.out.print("si ");
        //                 break;
        //             default:
        //                 break;
        //         }    
        //     }
        //     System.out.print("| ");
        // }
        // -----------------------------------------------
        // -----------------------------------------------
        // int num, crz= 0, dia= 0, herr= 0, camp= 0, lim= 0;
        // for (int i = 0; i < 3; i++) {
        //     num = (int)Math.round(Math.random() * 4);
        //     switch (num) {
        //         case 0:
        //             System.out.print("Corazon ");
        //             crz++;
        //             break;
        //         case 1:
        //             System.out.print("Diamante ");
        //             dia++;
        //             break;
        //         case 2:
        //             System.out.print("Herradura ");
        //             herr++;
        //             break;
        //         case 3:
        //             System.out.print("Campana ");
        //             camp++;
        //             break;
        //         case 4:
        //             System.out.print("Limon ");
        //             lim++;
        //             break;
        //         default:
        //             break;
        //     }
        // }
        // if (crz == 3 || dia == 3 || herr == 3 || camp == 3 || lim == 3) {
        //     System.out.println("Enhorabuena, ha ganado 10 monedas");
        // } else if (crz == 2 || dia == 2 || herr == 2 || camp == 2 || lim == 2) {
        //     System.out.println("Bien, ha recuperado su moneda");
        // } else {
        //     System.out.println("Lo siento, ha perdido");
        // }
    }
}
