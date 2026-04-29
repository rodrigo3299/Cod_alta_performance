package exemplo2;

public class Main {
    public static void main(String[] args) {
        No lista = new No();
        lista.dado = 1;
        lista.prox = null;

        System.out.println("Lista : " +lista);
        System.out.println("\t Dado : " +lista.dado);
        System.out.println("\t Prox : " +lista.prox);


        System.out.println("\n\n Inserindo 2o nó como sucessor do nó que lista referencia");
        No novo = new No();
        novo.dado = 2;
        novo.prox = null;

        lista.prox = novo; //torna nó referencia do por novo o sucessor

        System.out.println("Lista : " +lista);
        System.out.println("\t Dado : " +lista.dado);
        System.out.println("\t Prox : " +lista.prox);


        System.out.println("Lista : " +novo);
        System.out.println("\t Dado : " +novo.dado);
        System.out.println("\t Prox : " +novo.prox);



    }
}
