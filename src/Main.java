public class Main {
    public static void main(String[] args) {
        double height = 1.87;
        int weight = 98;

        BmiService service = new BmiService();
        double bmi = service.calculate(1.87, 98);

        System.out.println();
        System.out.println(service.calculate(1.52, 56));

        System.out.println();
        System.out.println(service.calculate(1.76, 163));

        System.out.println();
        System.out.println(service.calculate(1.62, 73));

        System.out.println();
        System.out.println(bmi);
    }
}