package teste;

import Pilhas.Pilha_Int;

public class MainTeste {
    public static void main(String[] args) {
        Pilha_Int pilha = new Pilha_Int();
        pilha.init();
        pilha.push(11);
        pilha.push(22);
        pilha.push(33);
        pilha.push(44);
        pilha.push(55);
        pilha.push(66);
        pilha.push(77);


        if (pilha.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Valor do dado que está no topo da pilha : " +pilha.top());
        }

        pilha.esvazia();

 /*       if (pilha.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Valor Retirado: " +pilha.pop());
        }

        if (pilha.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Valor Retirado: " +pilha.pop());
        }

        if (pilha.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Valor Retirado: " +pilha.pop());
        }

        if (pilha.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Valor Retirado: " +pilha.pop());
        }

        if (pilha.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Valor Retirado: " +pilha.pop());
        }

        if (pilha.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Valor Retirado: " +pilha.pop());
        }

        if (pilha.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Valor Retirado: " +pilha.pop());
        }
*/
    }
}
