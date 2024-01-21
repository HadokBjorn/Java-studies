import java.util.ArrayList;
import java.util.Arrays;

public class NotDuplicated {
    private ArrayList<String> arrayOne = new ArrayList<String>();
    private ArrayList<String> arrayTwo = new ArrayList<String>();

    NotDuplicated(String[] arrayOne, String[] arrayTwo) {
        this.arrayOne = new ArrayList<String>(Arrays.asList(arrayOne));
        this.arrayTwo = new ArrayList<String>(Arrays.asList(arrayTwo));
    }

    void duplicatedResult(){
        //Caso queira guardar os elementos repetidos:
        //ArrayList<String> listOfDuplicated = new ArrayList<String>();
        //
        //verifica qual o menor array para ter menos trabalho :)
        if(arrayOne.size()<arrayTwo.size()){
            for(int i=0; i<arrayOne.size(); i++){
                boolean duplicated = arrayTwo.contains(arrayOne.get(i));
                if (duplicated) {
                    //listOfDuplicated.add(arrayOne.get(i));
                    System.out.println(arrayOne.get(i));
                }
            }
        }else{
            for(int i=0; i<arrayTwo.size(); i++){
                boolean duplicated = arrayOne.contains(arrayTwo.get(i));
                if (duplicated) {
                    //listOfDuplicated.add(arrayTwo.get(i));
                    System.out.println(arrayTwo.get(i));
                }
            }
        }
        //System.out.println(listOfDuplicated);
    }
}
