public class FuncionTest {
    public static boolean esPrimo(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean esCapicua(int num){
        if (num > -10 && num < 10) {
            return false;
        } else {
            int aux = num, reverse = 0;
            while (num != 0) {
                reverse = (reverse * 10) + (num % 10);
                num /= 10;
            }
            if (reverse == aux) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static int binario(int num){
        int bi = 1;
        while (num != 0) {
            bi = (bi * 10) + (num % 2);
            num = num / 2;
        }
        return bi;
    }
    public static void main(String[] args) {
        // for (int i = 2; i < 1001; i++) {
        //     if (esPrimo(i)) {
        //         System.out.print(i + " ");
        //     }
        // }
        // System.out.println("\n");
        // for (int i = 1000; i <= 9999; i++) {
        //     if (esCapicua(i)) {
        //         System.out.print(i + " ");
        //     }
        // }
        System.out.println(binario(78));
    }
}
