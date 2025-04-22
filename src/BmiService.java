public class BmiService {

    public int calculate(double height, int weight) {

        double result = weight / (height * height);

        return (int) result;
    }
}
