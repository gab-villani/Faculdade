/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoredigital;

/**
 *
 * @author rf3232
 */
public class BuscaDigital {

    public void percorrer(String chave, NoTrie no) {
        for (int i = 0; i < chave.length(); i++) {
            System.out.println("Caracter: " + chave.charAt(i));
            
            if(no.filho ==  null){
                NoTrie filho = new NoTrie();
               
                
                
            }            
            
            
            
        }
    }

    public void percorrerRecursivo(String chave, int pos) {
        if (pos != chave.length()) {
            System.out.println("Caracter: " + chave.charAt(pos));
            pos++;
            percorrerRecursivo(chave, pos);            
        }
    }

}
