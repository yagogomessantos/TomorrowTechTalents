import java.util.List;

public class Soma implements Calculo {

    @Override
    public double calcular(List listOfNumbers) {
        double result = (Double) listOfNumbers.get(0);
        for (int i = 1; i < listOfNumbers.size(); i++) {
            result += (Double) listOfNumbers.get(i);
        }
        return result;
    }


}
