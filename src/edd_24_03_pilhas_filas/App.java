package edd_24_03_pilhas_filas;

public class App {
    public static void main(String[] args) {

        Stack p1 = new Stack(5);
        
        p1.empilhar(5);
        System.out.println(p1.topo());
        p1.empilhar(6);
        p1.empilhar(2);
        p1.empilhar(1);
        p1.empilhar(12);
        p1.desempilhar();
        System.out.println(p1.topo());
        System.out.println(p1.tamanho());
        p1.exibe();


        Queue fila = new Queue(5);

        fila.enfileirar(0);
        fila.enfileirar(0);
        fila.enfileirar(0);
        fila.enfileirar(0);
        fila.enfileirar(0);
        fila.desenfileirar();
        fila.desenfileirar();
        fila.enfileirar(0);
        fila.enfileirar(0);
        fila.exibir();

    }
    
}
