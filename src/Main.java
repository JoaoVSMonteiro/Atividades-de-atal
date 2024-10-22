import service.CustomListService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CustomListService list = new CustomListService<>();
        list.add("FIFA2024");
        list.add("GTA V");
        list.add("VALORANT");

        System.out.println("primeiro jogo: " + list.get(0));
        System.out.println("tamanho da lista: " + list.size());


        list.remove(0);
        System.out.println("Jogo Removido foi: " + list.get(0));
    }
}