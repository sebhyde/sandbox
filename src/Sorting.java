public class Sorting {
    public static void main(String[] args){
        int[] numbers={3,1,4,5,9};
        printArray(numbers);
        int[] sortedNumbers=new int[numbers.length];
        printArray(sortedNumbers);
    }

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
}
