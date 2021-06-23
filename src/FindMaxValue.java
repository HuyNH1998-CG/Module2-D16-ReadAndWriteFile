import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        List<Integer> numbers = readAndWrite.readFile("E:\\Module2-D16-ReadAndWriteTxt\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWrite.writeFile("result.txt",maxValue);
    }
}
