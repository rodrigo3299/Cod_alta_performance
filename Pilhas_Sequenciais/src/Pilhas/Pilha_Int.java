package Pilhas;

public class Pilha_Int {
    final int N = 6;
    int dados[] = new int[N];
    int topo;

    public void init(){
        topo = 0;
    }

    public boolean isEmpty(){
        return (topo==0);
    }

    public boolean isFull(){
        return (topo==N);
    }

    public void push(int elem) {
        if (isFull()) {
            System.out.println("Stack overflow");  //testou se a pilha estava cheia
        } else {
            dados[topo] = elem;
            topo++;
        }
    }

    public int pop () {
        topo--;
        return dados[topo];
    }

    public int top(){
        return dados[topo-1];
    }

    public void esvazia(){
        while(!isEmpty()){
            System.out.println("\t" +pop());
        }
    }
}
