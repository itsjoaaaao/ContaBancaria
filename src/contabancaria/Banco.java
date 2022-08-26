/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author João P. Arquim
 */

public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner teclado = new Scanner(System.in);
        ContaBanco b1 = new ContaBanco();
        int op;
        
        do{
            /*System.out.println("\t------Banco Java------\n");
            System.out.print("1 - Cadastrar\n");
            System.out.print("2 - Depositar\n");
            System.out.print("3 - Sacar\n");
            System.out.print("4 - Pagar mensalidade\n");
            System.out.print("5 - Fechar conta\n");
            System.out.print("6 - Sair\n");
            op = teclado.nextInt();*/
            
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastrar\n2 - Depositar\n3 - Sacar\n4 - Pagar mensalidade\n5 - Fechar conta\n6 - Sair\n Digite uma opção:\n", "----Banco Java----", JOptionPane.INFORMATION_MESSAGE));
            
            switch(op){
                case 1:
                    //teste System.out.println("João");
                    b1.abrirConta(op, dono, tipo, true);
                break;
                case 2:
                    b1.depositar(op, op);
                break;
                case 3:
                    b1.sacar(op, op);
                break;
                case 4:
                    b1.pagarMensal();
                break;
                case 5:
                    b1.fecharConta(op, true);
                break;
                case 6:
                    JOptionPane.showMessageDialog(null, "\tSaindo...\n");
                    //System.out.println("\tSaindo...\n");
                break;
            }
            
        }while(op<=5);
        
    }
    
}
