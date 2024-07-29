import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);


        //usando function com expressao lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrarNums = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrarNums)
                .toList();

        numerosDobrados.forEach(num -> System.out.println(num));
    }
}
