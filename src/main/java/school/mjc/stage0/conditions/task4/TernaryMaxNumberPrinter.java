package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int temp = (first > second) ? first : second;
        int tempTwo = (second > third) ? second : third;
        int result = (temp > tempTwo) ? temp : tempTwo;
        System.out.println(result);
    }
}
