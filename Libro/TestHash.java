import java.util.HashMap;
import java.util.Map;

public class TestHash {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(924, "Amalia Nuñez");
        m.put(921, "Cindy Nero");
        m.put(700, "Cesar Vazquez");
        m.put(219, "Victor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito ");
        System.out.println("Todas las entradas del diccionario extraidas con entrySet:");
        System.out.println(m.entrySet());
        System.out.println("\nEntradas del diccionario extraidas una a una:");
        for (Map.Entry pareja: m.entrySet()) {
            System.out.println(pareja);
        }
        System.out.println("Codigo\tNombre\n------\t-------------");
        for (Map.Entry pareja: m.entrySet()) {
            System.out.print(pareja.getKey() + "\t");
            System.out.println(pareja.getValue());
        }
    }
}
