import service.CustomListService;


public class Main {
    public static void main(String[] args) {

        CustomListService list = new CustomListService<>();
        list.add("League of Legends");
        list.add("Grand Theft Auto: San Andreas");
        list.add("Call Of Duty 2");

        System.out.println("primeiro jogo: " + list.get(0));
        System.out.println("tamanho da lista: " + list.size());


        list.remove(0);
        System.out.println("Jogo Removido foi: " + list.get(0));
    }
}