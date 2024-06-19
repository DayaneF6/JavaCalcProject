
package javacalccollege;

import controller.operacoes;
import model.Calc;

/**
 *
 * @author dayan
 */
public class main {

    public static void main(String[] args) throws Exception {

        operacoes operacoes = new operacoes();
        Calc calc = new Calc();

        operacoes.coletor();// Coleta a operação do usuário
        operacoes.coletarValores();  // Coleta os valores do usuário
        String resultado = operacoes.selecionarOperacoes();
        //String resultado = Operacao.selecionarOperacao(calculadora);
        System.out.println(resultado); // Exibe o resultado
    }
}
