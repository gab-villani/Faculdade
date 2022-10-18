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
public class Tries {

    public NoTrie inserirChave(String palavra, int pos, NoTrie noAtual) {

        if (noAtual.filho == null) {
            NoTrie novo = new NoTrie();
            novo.chave += palavra.charAt(pos);
            novo.ini = pos;
            novo.fim = pos;
            noAtual.filho = novo;
            if (palavra.length() - 1 > pos) {
                noAtual.filho = inserirChave(palavra, pos + 1, novo);
            }
        } else {
            NoTrie aux;
            NoTrie ant = null;
            aux = noAtual.filho;

            while (aux !=  null && aux.chave.charAt(0) != palavra.charAt(pos)) {
                ant = aux;
                aux = aux.irmao;
            }
            if (aux == null) {
                NoTrie novo = new NoTrie();
                novo.chave += palavra.charAt(pos);
                novo.ini = pos;
                novo.fim = pos;
                ant.irmao = novo;
                ant.irmao = inserirChave(palavra, pos  + 1, ant.irmao);
            } else {
                aux = inserirChave(palavra, pos + 1, aux);
            }
        }
        return noAtual;
    }

    public NoTrie imprimir(NoTrie no) {
        System.out.println("");
        NoTrie aux = no.filho;

        while (aux != null) {
            System.out.println("Pai-> " +  no.chave  + "   Filho-> " + aux.chave );
            aux = aux.irmao;
        }
        aux = no.filho;
        while (aux != null) {          
            if (aux.filho != null) {
                
                aux = imprimir(aux);
            }
            aux = aux.irmao;
        }
        return no;
    }

}
