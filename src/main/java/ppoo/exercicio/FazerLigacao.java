/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppoo.exercicio;

/**
 *
 * @author Proprietário
 */
public class FazerLigacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Observada o = new Telefone();
        PessoaProxima eric = new PessoaProxima();
        EscutaClandestina detetive = new EscutaClandestina();
        
        
        o.adicionarObservadora(eric);
        o.adicionarObservadora(new SecretariaEletronica());
        o.adicionarObservadora(new FAX());
        o.adicionarObservadora(new EscutaClandestina());
        o.notificarObservadoras();
        o.removerObservadora(eric);
        o.adicionarObservadora(detetive);
        o.notificarObservadoras();
    }
    
}
