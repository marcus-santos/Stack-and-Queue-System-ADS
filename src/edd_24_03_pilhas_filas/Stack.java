package edd_24_03_pilhas_filas;

public class Stack {
    public int tamanho = 0;
    public int topo = -1;
    public int[] vet;
    public int vetSize;

    
    public Stack(int i) {
        vet = new int[i];
        vetSize = i; 
    }

    public void empilhar(int x){
        if(cheia()){
            System.out.println("A pilha esta cheia, desempilhe a mesma antes de empilhar novamente.");
        }else
            vet[++topo] = x;
    }

    public void desempilhar(){
        if(vazia()){
            System.out.println("A pilha já esta vazia!");
        }else
            topo--;
    }

    public void exibe(){
        if(vazia()){
            System.out.println("Não existem itens na pilha para exibir!");
        }
        else{
            for(int i = 0; i < vetSize; i++){
                System.out.print(vet[i] + ",");
            }
        }
    }

    public int topo(){
        if(vazia()){
            return topo;
        }else
            return vet[topo];
    }

    public int tamanho(){
        if(vazia()){
            return 0;
        }else
            return topo;
    }
    
    private boolean cheia(){
        if(topo < vetSize - 1){
            return false;
        }else 
            return true;
    }

    private boolean vazia(){
        if(topo == -1){
            return true;
        }else   
            return false;
        
    }
    
    
}
