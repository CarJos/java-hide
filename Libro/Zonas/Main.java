package Zonas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op, zona;
        Scanner sc = new Scanner(System.in);
        Zona principal = new Zona(1000);
        Zona compra_venta = new Zona(200);
        Zona vip = new Zona(25);
        do {
            System.out.print("\n1. Mostrar entradas por vender\n2. Vender entradas \n3. Salir");
            System.out.print("\nIngrese una opcion: ");
            op = sc.nextInt();
            
            if (op == 1) {
                System.out.print("\n1. Principal\n2. Compra-Venta\n3.VIP");
                System.out.print("\nIngrese una zona: ");
                zona = sc.nextInt();
                if (zona == 1) {
                    System.out.println(principal.getEntradasPorVender());
                } else if (zona == 2) {
                    System.out.println(compra_venta.getEntradasPorVender());
                } else if (zona == 3){
                    System.out.println(vip.getEntradasPorVender());
                }
            } else if (op == 2) {
                System.out.print("\n1. Principal\n2. Compra-Venta\n3.VIP");
                System.out.print("\nIngrese una zona: ");
                zona = sc.nextInt();
                int qty;
                System.out.print("\nCantidad de entradas a vender: ");
                qty = sc.nextInt();
                if (zona == 1) {
                    principal.vender(qty);
                } else if (zona == 2) {
                    compra_venta.vender(qty);
                } else if (zona == 3){
                    vip.vender(qty);
                }
            }
        } while (op != 3);
    }
}
