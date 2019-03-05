import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int maxValue = 4000000;

        Fibonacci fibonacci = new Fibonacci();
        ArrayList<Integer> fibonacciLists = fibonacci.createFibonacciSequence(maxValue);
        int sum = fibonacci.sumEven(fibonacciLists);
        System.out.println(sum);
    }

    public ArrayList<Integer> createFibonacciSequence(int maxValue) {
        ArrayList<Integer> fibonacciLists = new ArrayList<>();

        fibonacciLists.add(1);
        fibonacciLists.add(2);
        int i = 0;
        boolean check = true;

        while (check) {

            if (fibonacciLists.get(fibonacciLists.size() - 1) > maxValue) {
                fibonacciLists.remove(fibonacciLists.size() - 1);
                check = false;
            } else {
                fibonacciLists.add(fibonacciLists.get(i) + fibonacciLists.get(i + 1));
            }
            i++;
        }
        return fibonacciLists;
    }

    public int sumEven(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
