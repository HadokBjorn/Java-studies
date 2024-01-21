
public class App {
    public static void main(String[] args) throws Exception {
        // Teste do Exercicio 1 - O Que é esse número?
        int[] inputsNumber = {5, -5, 4, -4, 0};
        //  chamada para a verificação do Exercicio
        for (int i = 0; i < inputsNumber.length; i++){
            new WhatIsThisNumber(inputsNumber[i]).verifyInputNumber();
        }


        //----------------------------------------------------------------
        //  Teste do Exercicio 2 - Fibonnaci
        //int[] input2 = {5 ,10, 20, 0, -20, -10, -5};
        //for (int i = 0; i < input2.length; i++){
        //    new Fibonacci(input2[i]).listFibonacci();
        //}


        //----------------------------------------------------------------
        // Teste do Exercicio 3 - Multiplica Aí
        //new MultiplicationTable(10).tableResult();


        //----------------------------------------------------------------
        //Teste do Exercicio 4 - Pirâmide de números
        //new NumberPyramid(5).pyramidResult();
        //new NumberPyramid(15).pyramidResult();


        //----------------------------------------------------------------
        //Teste do Exercicio 5 - Duplicados Não!
        //String[] arr1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        //String[] arr2 = {"Manga", "Caqui", "Morango", "Amora"};
        //new NotDuplicated(arr1,arr2).duplicatedResult();


        //----------------------------------------------------------------
        //Teste do Exercicio 6 - Holidayzer
        //new Holidayzer().allHolidays();
        //saída; Confraternização Mundial
        //new Holidayzer().isHoliday("01-01-2024");
        //saída: Não é feriado
        //new Holidayzer().isHoliday("25-01-2024");
        //saída: Natal
        //new Holidayzer().isHoliday("25-12-2024");
    }
}
