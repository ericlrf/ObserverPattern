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
public interface Observada {

    public abstract void adicionarObservadora(Observadora observadora);

    public abstract void removerObservadora(Observadora observadora);

    public abstract void notificarObservadoras();
}
