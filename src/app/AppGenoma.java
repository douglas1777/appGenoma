package app;

import java.util.Scanner;
import tad.Stack;

/**
 *
 * @author Siabreu
 */
public class AppGenoma {
    public static void main(String[] args) {
        Stack pilhaGenoma = new Stack();
        Scanner entrada = new Scanner(System.in);
        boolean padrao = true;
        String genoma;
        
        System.out.println("Enre com o genoma: " );
        genoma = entrada.next();
        int i = 0;
        while(genoma.charAt(i) != 'C'){
            pilhaGenoma.push(genoma.charAt(i));            
            i++;
        }
        
        System.out.println("Pilha Genoma: \n" + pilhaGenoma);
        
        if(pilhaGenoma.size() == genoma.length()-1 - i){
            while( !pilhaGenoma.isEmpty()){
                char desempilhado = pilhaGenoma.pop();
                i++;
                if(desempilhado != genoma.charAt(i)){
                    padrao = false;
                    break;
                }
            }        
        }else{
            padrao = false;
        }
        
        if(padrao){
            System.out.println("ESTÁ no padrão!");
        }else{
            System.out.println("NÃO ESTÁ no padrão!");
        }
    }
}
