
package controller;

import java.util.Scanner;
import model.Calc;


public class operacoes {

    Calc cal = new Calc();

    Scanner coletor = new Scanner(System.in);

    public void coletor() throws Exception {
        

        System.out.println("****** CALCULADORA ******");
        System.out.println("");
        System.out.println("1-SOMA");
        System.out.println("");
        System.out.println("2-SUBTRACAO");
        System.out.println("");
        System.out.println("3-MULTIPLICACAO");
        System.out.println("");
        System.out.println("4-DIVISAO");
        System.out.println("*******************");
        System.out.println("");

        System.out.println("DIGITE A OPERACAO!!!");

        int Operacao = coletor.nextInt();

        switch (Operacao) {
            case 1 ->
                cal.setOperacao("SOMA");
            case 2 ->
                cal.setOperacao("SUBTRAÇÃO");
            case 3 ->
                cal.setOperacao("MULTIPLICACAO");
            case 4 ->
                cal.setOperacao("DIVISÃO");

            default ->
                throw new Exception("Opcao Invalida!!");

        }

    }

    public void coletarValores() {

        System.out.println("*******************");
        System.out.println("");
        System.out.println("PRIMEIRO VALOR");
        cal.setValor1(coletor.nextDouble());
        System.out.println("*******************");
        
        System.out.println("OPERACAO SELECIONADA:" + cal.getOperacao());

        System.out.println("*******************");
        System.out.println("");
        System.out.println("SEGUNDO VALOR");
        cal.setValor2(coletor.nextDouble());

    }

    public String selecionarOperacoes() {
        return switch (cal.getOperacao()) {
            case "SOMA" ->
                soma(cal);
            case "SUBTRAÇÃO" ->
                subtracao(cal);
            case "MULTIPLICACAO" ->
                multiplicacao(cal);
            case "DIVISÃO" ->
                divisao(cal);
            default ->
                "Operacao invalida!";
        };
    }

    public String soma(Calc objeto) {

        double resultado = objeto.getValor1() + objeto.getValor2();
        System.out.println("");
        String mensagemRetorno = "O RESULTADO DA SOMA FOI DE " + resultado;
        return mensagemRetorno;

    }

    public String subtracao(Calc objeto) {

        double resultado = objeto.getValor1() - objeto.getValor2();
        System.out.println("");
        String mensagemRetorno = "O RESULTADO DA SUBTRACAO FOI DE " + resultado;
        return mensagemRetorno;

    }

    public String multiplicacao(Calc objeto) {

        double resultado = objeto.getValor1() * objeto.getValor2();
        System.out.println("");
        String mensagemRetorno = "O RESULTADO DA MULTIPLICACAO FOI DE " + resultado;
        return mensagemRetorno;

    }

    public String divisao(Calc objeto) {

        double resultado = objeto.getValor1() / objeto.getValor2();
        System.out.println("");
        String mensagemRetorno = "O RESULTADO DA DIVISAO FOI DE " + resultado;
        return mensagemRetorno;

    }

}
