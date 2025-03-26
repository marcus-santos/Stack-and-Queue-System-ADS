package edd_24_03_pilhas_filas;

public class Queue {
  private final int N;
  private final int vet[];
  private int cabeca,cauda;

  public Queue(int i) {
    this.N = i;
    this.cabeca = -1;
    this.cauda = -1;
    this.vet = new int[N];
  }
  
  public void enfileirar(int x){
    if(cabeca == -1){
      vet[++cabeca] = x;
      cauda++;
    }
    else if(!cheia() && cauda < N -1){
      vet[++cauda] = x;
    }
    else if(!cheia() && cauda == N-1){
      cauda = 0;
      vet[cauda] = x;
    }else
      System.out.println("Fila Cheia!");
  }

  public void desenfileirar(){
    if(cabeca < N-1 && cabeca != -1){
      cabeca++;
    }else if(cabeca == cauda && cabeca != -1){
      System.out.println("entrei aqui");
      cabeca = -1;
      cauda= -1;
    }else{
      System.out.println("Não há nenhum item para desenfileirar.");
    }
  }
  
  public int cabeca(){
    return vet[cabeca];
  }

  public int cauda(){
    return vet[cauda];
  }
  
  private boolean vazia(){
    if(cabeca == -1 && cauda == -1){
      return true;
    }else
      return false;
  }
  
  private boolean cheia(){
    if(cabeca > cauda && (cabeca - cauda == 1)){
      return true;
    } else if(cabeca < cauda && ((cauda +1) - cabeca) == N){
      return true;
    }else 
      return false;
  }
  
  public int tamanho(){
    if(cabeca < cauda){
      return (cauda+1) - cabeca;
    }
    else if(cabeca == cauda){
      return 1;
    }
    else
      return (cauda) - cauda;
  }

  public void exibir(){
    int i = cabeca;

    System.out.println(i);
    i = (i+1) % N;

    while(i != (cauda + 1) %N){
    System.out.println(i);
      i = (i+1) % N;
    }
  }
}
