public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(90, 128)) {
            System.out.println("Случайное число: " + r);
            if (r == 128) {
                System.out.println("Выпало число 128, давайте на этом закончим");
                break;
            }
        }
    }
}
