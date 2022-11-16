import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHash {
    public static void main(String[] args) {
        // HashMap<Integer, String> m = new HashMap<Integer, String>();
        // m.put(924, "Amalia Nuñez");
        // m.put(921, "Cindy Nero");
        // m.put(700, "Cesar Vazquez");
        // m.put(219, "Victor Tilla");
        // m.put(537, "Alan Brito");
        // m.put(605, "Esteban Quito ");
        // System.out.println("Todas las entradas del diccionario extraidas con entrySet:");
        // System.out.println(m.entrySet());
        // System.out.println("\nEntradas del diccionario extraidas una a una:");
        // for (Map.Entry pareja: m.entrySet()) {
        //     System.out.println(pareja);
        // }
        // System.out.println("Codigo\tNombre\n------\t-------------");
        // for (Map.Entry pareja: m.entrySet()) {
        //     System.out.print(pareja.getKey() + "\t");
        //     System.out.println(pareja.getValue());
        // }
        int tries = 3;
        String msg;
        HashMap<String, String> users = new HashMap<String, String>();
        users.put("carlos", "abc123");
        users.put("cjsp92", "xyz789");
        users.put("sanper19", "hgj456");
        Scanner sc = new Scanner(System.in);
        while (tries != 0) {
            System.out.println("Ingrese la contraseña: ");
            String user = sc.nextLine();
            System.out.println("Ingrese la contraseña: ");
            String pass = sc.nextLine();
            System.out.println(pass == users.get(user));
            // if (pass == users.get(user)) {
            //     System.out.println("Sigue intentando");
            //     tries--;
            // } else {
            //     System.out.println("Accediste");
            //     break;
            // }
        }
        if (tries == 0) {
            System.out.println("No accediste");
        }
    }
}
