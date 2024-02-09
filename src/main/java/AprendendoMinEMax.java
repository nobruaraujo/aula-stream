import java.util.stream.Stream;

public class AprendendoMinEMax {

    public static void main(String[] args) {
        Double[] notas = {5.5, 5.5, 7.3, 7.2};

        var maxNumber = Stream.of(notas).max((nota1, nota2) -> {
            if (nota1 < nota2) return -1;
            if (nota1 > nota2) return 1;
            return 0;
        }).get();

        System.out.println("Maior nota: " + maxNumber);

        var minNumber = Stream.of(notas).min((nota1, nota2) -> {
            if (nota1 < nota2) return -1;
            if (nota1 > nota2) return 1;
            return 0;
        }).get();

        System.out.println("Menor nota: " + minNumber);
    }

}
