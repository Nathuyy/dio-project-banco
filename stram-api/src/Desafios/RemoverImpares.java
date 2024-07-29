package Desafios;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Desafio 4 - Remova todos os valores ímpares:

public class RemoverImpares {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        Predicate<Integer> impares = num -> num % 2 == 1;

        numeros.removeIf(impares);

        numeros.forEach(System.out::println);
    }
}
