package teste;

import filas.FilaInt;

public class MainTeste {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        fila.init();
        fila.enqueue(23);
        fila.enqueue(24);
        fila.enqueue(25);
        fila.enqueue(26);
        if(fila.isEmpty()){
            System.out.println("FIla vazia");
        }else {
            System.out.println("Valor retirado da fila : " + fila.dequeue());
        }
        while ((!fila.isEmpty())){
            System.out.println("Valor retirado da fila : " +fila.dequeue());
        }
        System.out.println("Valor retirado da fila : " + fila.dequeue());
    }
}
