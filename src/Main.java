public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 98; // вес в кг
        double heightM = 1.87; // рост в метрах
        int bmi = service.calculate(weightKg, heightM);
        System.out.println("bmi-индекс: " + bmi);
    }
}
