package tad;
/**
 *
 * @author Siabreu
 */
public class Stack {
    private No topo;
    
    public Stack(){
        topo = null;
    }
    
    public boolean isEmpty(){
        return topo == null;
    }
    
    public void push(char dado){
        No novoNo = new No(dado); //cria o nó
        novoNo.prox = topo; //faz o prox do novo nó apontar para o topo
        topo = novoNo; //faz o topo apontar para o nó criado       
    }
    
    public char pop(){
        if(! isEmpty()){
            No temp = topo; //recupera o elemento do topo
            topo = topo.prox; //desloca o topo para baixo
            return temp.dado; //retorna o elemento do topo
        }else
            throw new RuntimeException("==> Pilha Vazia!");
    }
    
    public char peek(){
        if(! isEmpty()){            
            return topo.dado;
        }else
            throw new RuntimeException("==> Pilha Vazia!");
    }
    
    public int size(){
        No atual = topo; //atual inicia com o topo
        int qtd = 0;
        while(atual != null){ //enquanto atual não for null
            qtd++; //conta + 1
            atual = atual.prox; //avança para o proximo nó
        }
        return qtd;
    }

    @Override
    public String toString() {
        No atual = topo; //atual inicia com o topo
        StringBuilder saida = new StringBuilder();
        while(atual != null){ //enquanto atual não for null
            saida.append(atual).append("\n");            
            atual = atual.prox; //avança para o proximo nó
        }
        return saida.toString();
    }    
}
