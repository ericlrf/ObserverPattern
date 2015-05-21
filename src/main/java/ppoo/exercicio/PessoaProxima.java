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
public class PessoaProxima implements Observadora {

    @Override
    public void atualizar() {
        System.out.println("Uma pessoa próxima escutou o telefone tocar e atendeu a ligacao.");
    }

}
