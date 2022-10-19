/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoredigital;

import java.util.ArrayList;
import java.util.*;   


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
        List list = new ArrayList();
        
       //list.add(0, tries.inserirChave("casa",0 , raiz));
        raiz = tries.inserirChave("aluno", 0, raiz);
        raiz = tries.inserirChave("camisa", 0, raiz);
        
  
        for(int i=0 ;i<raiz.chave.length() ;i++){
            list.add(raiz);
            
    }
        
        
  
        //tries.imprimir(raiz);
        System.out.println(list.toString());
        
        
        //BuscaDigital bd = new BuscaDigital();
        //bd.percorrer("Casa", raiz);
                
                
        
    }
    
    
    
    
}
