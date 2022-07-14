import javax.management.ImmutableDescriptor;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ExercicioTecProg05 {
    public static void main(String[] args) {
        List<Map<String, String>> list = List.of(
                Map.of("nome", "João", "telefone", "9329823423"),
                Map.of("nome", "Maria", "telefone", "9124235435"),
                Map.of("nome", "Marta", "telefone", "9456335387"),
                Map.of("nome", "José", "telefone", "9632874738"),
                Map.of("nome", "Judas", "telefone", "9329244683")
        );
        list.stream().
                filter(stringStringMap -> stringStringMap.get("telefone").toString().indexOf("7") >= 0)
                .sorted((o1, o2) -> {
                    return o1.get("nome").compareTo(o2.get("nome"));
                })
                .forEach(stringStringMap -> System.out.println(stringStringMap.get("nome")));
        System.out.println();
    }
}
