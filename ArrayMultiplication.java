package chapterSeven;

public class ArrayMultiplication {
    int[] numbers = {2, 4, 3, 1, 8};

    public int[] doubledArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;


        }
        return numbers;
    }
}

