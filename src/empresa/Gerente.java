/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author 13.03349-2
 */
public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }
    
    public void demite(Funcionario funcionario){
        System.out.println("Está demitido! Nome: " + funcionario.getNome());
    }
    @Override
    public void buscaVR(){
        System.out.println("Sou gerente TOP! Meu VR é de R$ 3.000,00");
    }
}
