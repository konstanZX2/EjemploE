public class Error5 {
    public static void main(String[] args) {
        //El siguiente programa no compila, ¿Cuál es la razón?
        int num1 = 10, num2 = -30;
        int resultado = num2 / num1;
        System.out.printf("El resultado de dividir %d entre %d es %d",
                num2,
                num1,
                resultado);
    }
}
