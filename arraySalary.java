import java.util.Arrays;

public class arraySalary{
    public static double[] taxAndsalaries(double[] salaries, int index) {
        if (index == salaries.length) {
            return new double[0];
        } else {
            double salary = salaries[index];
            double newSalary = salary + (0.1 * salary);
            double[] remaining = taxAndsalaries(salaries, index + 1);
            double[] result = new double[remaining.length + 1];
            result[0] = newSalary;
            System.arraycopy(remaining, 0, result, 1, remaining.length);
            return result;
        }
    }

    public static void main(String[] args) {
        double[] salaries = {10000, 20000.0, 30000.0};
        double[] newSalaries = taxAndsalaries(salaries, 0);
        System.out.println(Arrays.toString(newSalaries));
    }
}
