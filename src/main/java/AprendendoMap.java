import java.util.stream.Stream;

public class AprendendoMap {
    public static void main(String[] args) {
        Double[] notas = {5.5, 5.5, 7.3, 7.2};

        //CONSTRUÇÃO: Stream.of()
        //INTERMEDIÁRIA: .map() com função de alto nível
        //FINALIZAÇÃO: forEach()
        Stream.of(notas)
                .map(nota -> nota + 2)
                .map(nota -> nota - 1)
                .forEach(System.out::println);
    }
}
