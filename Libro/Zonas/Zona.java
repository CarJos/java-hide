package Zonas;

public class Zona {
    public int entradasPorVender = 200;
    
    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    public void vender(int n) {
        if (entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esa zona están agotadas.");
        } else if (entradasPorVender < n) {
            System.out.println("Sólo me quedan " + entradasPorVender + " entradas para esa zona.");
        }
        if (entradasPorVender >= n) {
            entradasPorVender -= n;
            System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
        }
    }

}
