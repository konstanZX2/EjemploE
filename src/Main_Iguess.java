import javax.swing.*;

import java.util.Scanner;

public class Main_Iguess {
    public static void main(String[] args) {
        Scanner escaneado = new Scanner(System.in);
        int primerValor;
        int segundoValor;
        String operacion;
        System.out.println("Introduce el primer valor");
        primerValor = escaneado.nextInt();
        System.out.println("Introduce el segundo valor");
        segundoValor = escaneado.nextInt();
        System.out.println("Introduce el tipo de operacion: +,-,*,/");
        operacion = escaneado.next();
        switch (operacion) {
            case "+":
                System.out.println("El resultado de la suma es");
                System.out.println(primerValor + segundoValor);
                JOptionPane.showMessageDialog(null, "La suma de los numeros es " + (primerValor + segundoValor));
                break;
            case "-":
                System.out.println("El resultado de la resta es");
                System.out.println(primerValor - segundoValor);
                JOptionPane.showMessageDialog(null, "La resta de los numeros es " + (primerValor - segundoValor));
                break;
            case "*":
                System.out.println("El resultado de la multiplicacion es");
                System.out.println(primerValor * segundoValor);
                JOptionPane.showMessageDialog(null, "La multiplicacion de los numeros es " + (primerValor * segundoValor));
                break;
            case "/":
                System.out.println("El resultado de la division es");
                System.out.println(primerValor / segundoValor);
                JOptionPane.showMessageDialog(null, "La division de los numeros es " + (primerValor / segundoValor));
                break;

        }

    }
}

