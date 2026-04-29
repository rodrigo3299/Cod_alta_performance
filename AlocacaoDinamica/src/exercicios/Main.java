package exercicios;

public class Main {
    public static void main(String[] args) {
        No1 lista = new No1();
        lista.dado = 1;
        lista.prox = null;

        System.out.println("Lista : " +lista);
        System.out.println("\t Dado : " +lista.dado);
        System.out.println("\t Prox : " +lista.prox);


        System.out.println("\n\n Inserindo 2o nó como sucessor do nó que lista referencia");
        No1 novo = new No1();
        novo.dado = 2;
        novo.prox = null;

        lista.prox = novo; //torna nó referencia do por novo o sucessor

        System.out.println("Lista : " +lista);
        System.out.println("\t Dado : " +lista.dado);
        System.out.println("\t Prox : " +lista.prox);


        System.out.println("Lista : " +novo);
        System.out.println("\t Dado : " +novo.dado);
        System.out.println("\t Prox : " +novo.prox);

        System.out.println("Inserindo o 3o nó para se tornar o primeiro");
        No1 novo2 = new No1();
        novo2.dado = 3;
        novo2.prox = lista;

        System.out.println("Lista : " +novo2);
        System.out.println("\t Dado : " +novo2.dado);
        System.out.println("\t Prox : " +novo2.prox);

        lista = novo2;
        System.out.println("Lista : " +lista);
    }
}
