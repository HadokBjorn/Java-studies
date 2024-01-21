import java.util.ArrayList;

public class Fibonacci {
    private int inputNumber;

    public Fibonacci(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    void listFibonacci(){
        if(inputNumber == 0){
            System.out.println(inputNumber+" não possui sequencia de Fibonacci");
            return;
        }
        if(inputNumber < 0){
            inputNumber = -inputNumber;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        if(inputNumber > 0){
            list.add(0);
            list.add(1);
            for(int i = 2; i < inputNumber; i++){
                if(i>1){
                    list.add(list.get(i-1)+list.get(i-2));
                }
            }
            System.out.println(list);
        }
    }
}
