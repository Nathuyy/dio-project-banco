import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // usando consumer para imprimir os pares:

        numeros.forEach(num -> {
                    if (num % 2 == 0) {
                        System.out.println(num);
                    }
                }
        );
    }
}