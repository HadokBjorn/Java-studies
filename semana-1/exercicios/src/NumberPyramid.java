
public class NumberPyramid {
    private int inputValue;
    NumberPyramid(int inputValue) {
        this.inputValue = inputValue;
    }

    void pyramidResult(){
        for(int i = 1; i <= inputValue; i++){
            int currentValue = i;
            while (currentValue > 0) {
                System.out.print(i+ " ");
                currentValue--;
            }
            System.out.println();
        }
    }
}
