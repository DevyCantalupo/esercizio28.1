import java.util.LinkedList;
import java.util.List;
public class esercizio28di1 {
    public static void main(String[] args) {

        List<Fruta> listaFruta = new LinkedList<>();
        listaFruta.add(new Fruta("Manzana"));
        listaFruta.add(new Fruta("Watermelon"));
        System.out.println(listaFruta);

        listaFruta.addFirst(new Fruta("Mani"));
        listaFruta.addLast(new Fruta("almendras"));

        System.out.println(listaFruta);
    }
}