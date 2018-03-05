import java.util.Arrays;

public class SortTest {
    /* Tests the sort class.*/
    public static void sortTest(){
        String[] input = {"I", "have", "an", "egg."};
        String[] expected = {"an", "egg", "have", "I"};

        Sort.sort(input);

        for(int i = 0; i < input.length; i++){
            if(!input[i].equals(expected[i])){
                System.out.println("Mismatch in position" + i + ", we expected to have " + expected[i] + ", " +
                        "but we get " + input[i]);
            }
        }

        //Because '!=' checked whether two objects point to the same instance.
        if(!java.util.Arrays.equals(input, expected)){
            System.out.println("Error! There seems a problem with Sort.sort");
            return;
        }
    }

    public static void main(String[] args){
        sortTest();
    }
}
