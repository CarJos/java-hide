package Zonas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 1;
        Scanner sc = new Scanner(System.in);
        Zona venta = new Zona();
        while (op != 0) {
            int qty;
            System.out.println("Ingrese opcion: ");
            Scanner scn = new Scanner(System.in);
            op = sc.nextInt();
            if (op == 1) {
                System.out.println("Entradas disponibles: "+ venta.getEntradasPorVender());
            } else if(op == 2){
                System.out.println("Entradas a vender: ");
                qty = scn.nextInt();
                venta.vender(qty);
            } else if (op == 0){
                break;
            } else {
                System.out.println("Opcion invalida");
            }
        }
    }
}
