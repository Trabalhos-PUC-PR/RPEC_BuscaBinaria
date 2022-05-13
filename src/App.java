public class App {

    public static void main(String[] args) {

        int[] list = {0, 2, 4, 5, 6, 7, 9};
        int value = 2;
        int foundIndex = BuscaBinaria.indexOf(value, list);

        System.out.printf("Value searched: %d, list[%d]=%d", value, foundIndex, list[foundIndex]);

    }

}
