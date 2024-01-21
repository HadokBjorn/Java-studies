//  Faça um algoritmo para receber um número qualquer e 
//  imprimir na tela se o número é par ou ímpar, positivo ou negativo.
// Exemplos de Saída
//  -5 é ímpar e negativo.
//  10 é par e positivo.
public class WhatIsThisNumber {
    private int inputNumber;

    WhatIsThisNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    void verifyInputNumber() {
        boolean isPair = inputNumber % 2 == 0;
        boolean isPositive = inputNumber > 0;
        boolean isNegative = inputNumber < 0;
        boolean isZero = inputNumber == 0;
        if(isPositive && isPair){
            System.out.println(inputNumber+" é par e positivo");
            return;
        }
        if(isNegative && isPair){
            System.out.println(inputNumber+" é par e negativo");
            return;
        }
        if(isPositive && !isPair){
            System.out.println(inputNumber+" é ímpar e positivo");
            return;
        }
        if(isNegative && !isPair){
            System.out.println(inputNumber+" é ímpar e negativo");
            return;
        }
        //caso de exceção: quando o input é zero:
        if(isZero){
            System.out.println(inputNumber+" é par e neutro");
        }
    }
}
