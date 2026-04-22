package ex5processador;

import ex4.FilaInt;

import java.util.Scanner;

public class Processador {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opcao;
        do{
            System.out.println("1 - Submeter processo para excução");
            System.out.println("2 - Executar processo");
            System.out.println("3 - Shutdown");
            opcao = le.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Informe pid: ");
                    int pid = le.nextInt();
                    fila.enqueue(pid);
                    break;
                case 2:
                    if(fila.isEmpty()){
                        System.out.println("Não há processos aguardando na fila");
                    } else{
                        pid = fila.dequeue();
                        System.out.println("Process: " +pid+ " será executado agora");
                        System.out.println("...Execução");
                        System.out.println("Processo foi concluido? (1-sim)");
                        int resp = le.nextInt();
                        if(resp==1){
                            System.out.println("O processo " +pid+ " foi concluido");
                        } else{
                            fila.enqueue(pid);
                        }
                    }
                    break;
                case 3:
                    if(!fila.isEmpty()){
                        System.out.println("Há processor aguardando na fila");
                        System.out.println("Deseja encerrar todos? (1-sim): ");
                        int resp = le.nextInt();
                        if(resp==1){
                            while (!fila.isEmpty()){
                                System.out.printf("Processo " + fila.dequeue()+ " foi encerrado");
                            }
                        }
                        else{
                            opcao = 0;
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao!=3);

    }
}
