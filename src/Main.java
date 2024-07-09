public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        int weightInKg = 98;
        double bmi;
        bmi = weightInKg / (heightInMeters * heightInMeters);
        System.out.println("Индекс массы тела =" + (int) bmi);
    }
}