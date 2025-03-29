/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class ContaCorrente {
    double saque,deposito,transferencia;
    double saldoConta=0;
    int numeroConta;
    String nomeConta;
    String tipoConta;
    String banco;
    
    public ContaCorrente(int numeroConta, String nomeConta, String tipoConta, String banco){
        this.numeroConta = numeroConta;
        this.nomeConta = nomeConta;
        this.tipoConta = tipoConta;
        this.banco = banco;
    }
    
    
    void sacar(){
        saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que quer sacar: "));
        if(saque > 0 && saque <= saldoConta){
            saldoConta = saldoConta - saque;
        }else{
            JOptionPane.showMessageDialog(null,"Voce nao tem saldo suficiente, ou ta tentando sacar valores < 0");
        }
    }
    
    void depositar(){
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que quer depositar: "));
        if(deposito > 0){
            saldoConta = saldoConta + deposito;
        }else{
            JOptionPane.showMessageDialog(null,"Voce ta tentando depositar valores < 0 ??????????");
        }
    }
    
    void transferir(ContaCorrente conta2){
        transferencia = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que quer transferir para a outra conta: "));
        if(transferencia > 0 && transferencia <= saldoConta){
            saldoConta = saldoConta - transferencia;
            conta2.saldoConta = conta2.saldoConta + transferencia;
        }else{
            JOptionPane.showMessageDialog(null,"Voce nao tem saldo suficiente, ou ta tentando transferir valores < 0");
        }
    }
    
    void saldo(){
        JOptionPane.showMessageDialog(null,"Seu saldo e: " + saldoConta);
    }
    
}
