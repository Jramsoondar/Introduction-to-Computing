import java.math.BigDecimal;
import java.util.Arrays;

public class NLogNSort {
    public static void nLogNSort(BigDecimal[] numbers) {
        Arrays.sort(numbers);
    }

    public static void main(String[] args) {
        BigDecimal[] numbers = {
                new BigDecimal("3.14"),
                new BigDecimal("2.71"),
                new BigDecimal("1.618"),
                new BigDecimal("1.414"),
                new BigDecimal("2.718"),
                new BigDecimal("3.141"),
                new BigDecimal("1.732")
        };


        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}