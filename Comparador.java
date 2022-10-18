class Comparador {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        
        if(num1 > num2) {
            System.out.println(num1 + " es mayor a " + num2);
        } else if(num2 > num1) {
            System.out.println(num2 + " es mayor a " + num1);
        } else {
            System.out.println(num1 + " y " + num2 + " son iguales");
        }
    }   
}
