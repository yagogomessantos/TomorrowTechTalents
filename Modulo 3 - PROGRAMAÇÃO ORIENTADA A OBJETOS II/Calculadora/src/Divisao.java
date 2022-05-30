import java.util.List;

public class Divisao implements Calculo {

    @Override
    public double calcular(List listOfNumbers) {
        double result = (double) listOfNumbers.get(0);
        for (int i = 1; i < listOfNumbers.size(); i++) {

            if (listOfNumbers.get(i).equals(0d)) {
                throw new ArithmeticException();
            } else {
                result /= (double) listOfNumbers.get(i);
            }

        }
        return result;
    }
}
