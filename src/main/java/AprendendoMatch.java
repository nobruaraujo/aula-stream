import java.util.stream.Stream;

public class AprendendoMatch {
    public static void main(String[] args) {
        Double[] notas = {5.5, 5.5, 7.3, 7.2};

        //var isAprovado = Stream.of(notas).noneMatch(nota -> nota >= 7);
        //var isAprovado = Stream.of(notas).allMatch(nota -> nota >= 7);
        var isAprovado = Stream.of(notas).anyMatch(nota -> nota >= 7);

        System.out.println("STATUS: " + (isAprovado ? "APROVADO" : "REPROVADO"));
    }
}
