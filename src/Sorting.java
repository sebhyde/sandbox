import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class Sorting {
    public static void main(String[] args){
        int[] numbers={3,1,4,5,9,1};
        printArray(numbers);
        sortArray(numbers);
        printArray(numbers);
    }

    /** Sorts an array of numbers. */
    static void sortArray(int [] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            // Find the smallest value and its position.
            int sp=i;
            int sv=numbers[i];
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[j]<sv){
                    sp=j;
                    sv=numbers[j];
                }
            }
            System.out.println("for position " + i + ". the smallest value is " + sv + ", and occurs at position " + sp + "");;
            numbers[sp]=numbers[i];
numbers[i]=sv;
        }
    }
    /** Prints an array of numbers. */
    static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            int number = numbers[i];
            System.out.print(number);
        }
        System.out.println("]");
    }

    @Test
    public void testSortArray(){
        int[] numbers={3,1,4,5,9,1};
        sortArray(numbers);
        String s = Arrays.toString(numbers);
        assertEquals("[1, 1, 3, 4, 5, 9]", s);
    }@Test
    public void testSortEmptyArray(){
        int[] numbers={};
        sortArray(numbers);
        String s = Arrays.toString(numbers);
        assertEquals("[]", s);
    }@Test
    public void testSortSingleArray(){
        int[] numbers={-4};
        sortArray(numbers);
        String s = Arrays.toString(numbers);
        assertEquals("[-4]", s);
    }
}

