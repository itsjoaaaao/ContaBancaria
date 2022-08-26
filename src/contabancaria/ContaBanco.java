/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author João P. Arquim
 */

public class ContaBanco {

    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }
    
    //Scanner teclado = new Scanner(System.in);
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    ContaBanco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(int numConta, String dono, String tipo, boolean status){
        
        
        numConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da sua conta:\n", "Cadastro de conta", JOptionPane.QUESTION_MESSAGE));
        dono = JOptionPane.showInputDialog(null, "Digite o seu nome:\n", "Cadastro de conta", JOptionPane.QUESTION_MESSAGE);
        tipo = JOptionPane.showInputDialog(null, "Digite o tipo da conta:\n", "Cadastro de conta", JOptionPane.QUESTION_MESSAGE);
        
        /*System.out.print("Digite o numero da sua conta:\n");
        numConta = teclado.nextInt();
        System.out.print("Digite o seu nome:\n");
        dono = teclado.next();
        System.out.print("Digite o tipo da conta\n");
        tipo = teclado.next();*/
        
        status = true;
        
        if(tipo == "cp"){
            saldo = (float) 150.00;
        }else{
            saldo = (float) 50.00;
        }
        
        JOptionPane.showMessageDialog(null, "\tConta cadastrada com sucesso!!\n");
        
    }
    
    public void fecharConta(float saldo, boolean status){
        
        int escolha;
        
        if(saldo == 0){
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Você deseja fechar sua conta? [1] - sim ou [2] - não\n", "Fechamento da conta", JOptionPane.QUESTION_MESSAGE));
            /*System.out.println("Você deseja fechar sua conta? [1] - sim ou [2] - não\n");
            escolha = teclado.nextInt();*/
        
            if(escolha == '1'){
                JOptionPane.showMessageDialog(null, "\tConta fechada com sucesso!!\n");
                //System.out.println("\tConta fechada com sucesso!\n");
                status = false;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Você não pode fechar sua conta!!\n");
            //System.out.println("\tVocê não pode fechar sua conta!!\n");
        }
        
    }
    
    public void depositar(int numConta, float saldo){
        
        float deposito;
        
        if(status == true){
            
            deposito = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite quanto você deseja depositar:", "Depósito", JOptionPane.QUESTION_MESSAGE));
            //System.out.print("Digite quanto você deseja depositar:\n");
            //deposito = teclado.nextFloat();
        
            saldo = saldo + deposito;
        
            JOptionPane.showMessageDialog(null, "\tDepósito realizado com sucesso!!\n");
            //System.out.println("\tDeposito realizado com sucesso!!!\n");
        }
        
    }
    
    public float sacar(int numConta, float saldo){
        
        float saque;
        
        saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o quanto você deseja sacar:", "Saque", JOptionPane.INFORMATION_MESSAGE));
        //System.out.println("Digite o quanto você deseja sacar:\n");
        //saque = teclado.nextFloat();
        
        saldo = saldo - saque;
        
        JOptionPane.showMessageDialog(null, "\tSaque realizado com sucesso!!\n");
        //System.out.println("\tSaque realizado com sucesso!!\n");
        return saldo;
        
    }
    
    public void pagarMensal(){
        
        if(tipo == "cc"){
            saldo = saldo - 12;
        }else{
            saldo = saldo - 20;
        }
        
        
    }
    
}
