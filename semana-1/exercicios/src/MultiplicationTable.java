public class MultiplicationTable {
    private int inputValue;
    MultiplicationTable(int inputValue){
        this.inputValue = inputValue;
    }

    void tableResult(){
        System.out.println("Tabela de multiplicação de "+ inputValue);
        for (int i = 0; i <=10; i++){
            System.out.println(inputValue+" x "+i+" = "+inputValue*i);
        }
    }
}
