import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = new Calculator();

        System.out.println("Displacment:");
        calculator.calculatePrice(Integer.parseInt(reader.readLine()));
    }
}
