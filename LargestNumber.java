public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int largestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        System.out.println("The largest number is: " + largestNumber);
    }
    
}
