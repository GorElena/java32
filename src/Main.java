public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // m
        double weight = 98; // kg
        double index = service.calculate(weight, height);
        System.out.println("Индекс массы тела=" + (int) index);
    }
}