package Desafios;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//Desafio 2 - Imprima a soma dos números pares da lista:

public class SomaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream()
                .filter(num -> num % 2 == 0)
                .reduce(0, somar);

        System.out.println(resultado);



    }


}
