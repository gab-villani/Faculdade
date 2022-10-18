/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoredigital;

/**
 *
 * @author Jeandro
 */
public class ArvoreDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NoTrie raiz =  new NoTrie();
        Tries tries = new Tries();
        
        raiz = tries.inserirChave("casa",0 , raiz);
        raiz = tries.inserirChave("aluno", 0, raiz);
        raiz = tries.inserirChave("camisa", 0, raiz);
  
        tries.imprimir(raiz);
        //BuscaDigital bd = new BuscaDigital();
        //bd.percorrer("Casa", raiz);
                
                
        
    }
    
}
