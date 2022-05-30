import java.util.List;

public class Multiplicacao implements Calculo {
    @Override
    public double calcular(List listOfNumbers) {
        double result = (double) listOfNumbers.get(0);
        for (int i = 1; i < listOfNumbers.size(); i++) {
            result *= (double) listOfNumbers.get(i);
        }
        return result;
    }
}
