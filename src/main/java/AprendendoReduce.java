import java.util.stream.Stream;

public class AprendendoReduce {
    public static void main(String[] args) {
        Double[] notas = {5.5, 5.5, 7.3, 7.2};

        var isAprovado =
                Stream.of(notas)
                        .reduce((acumulador, nota) -> acumulador + nota)
                        .map(somaDasNotas -> somaDasNotas / 4)
                        .filter(nota -> nota > 7)
                        .isPresent();

        System.out.println("STATUS: " + (isAprovado ? "APROVADO" : "REPROVADO"));
    }
}
