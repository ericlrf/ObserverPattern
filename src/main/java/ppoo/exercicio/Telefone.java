/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppoo.exercicio;

import java.util.ArrayList;

/**
 *
 * @author Proprietário
 */
public class Telefone implements Observada {

    protected ArrayList<Observadora> observadores;

    public Telefone() {
        observadores = new ArrayList<Observadora>();
    }

    @Override
    public void adicionarObservadora(Observadora observadora) {
        observadores.add(observadora);
    }

    @Override
    public void removerObservadora(Observadora observadora) {
        observadores.remove(observadora);
    }

    @Override
    public void notificarObservadoras() {
        System.out.println("###############################");
        System.out.println("# O telefone comecou a tocar! #");
        System.out.println("###############################");
        for (Observadora observadora : observadores) {
            observadora.atualizar();
        }
    }

}
