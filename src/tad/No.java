package tad;
/**
 *
 * @author Siabreu
 */
public class No {
    //atributos
    char dado;
    No prox; //auto referencia
    
    public No(char dado){
        this.dado = dado;
        prox = null; //referencia nula
    }

    @Override
    public String toString() {
        return String.valueOf(dado);
    }
}