public class App {

    public static void main(String[] args) {

        int[] list = {0, 1, 4, 5, 6, 7, 9};

        if(BuscaBinaria.exists(list, 5)){
            System.out.println("Sim!");
        }else{
            System.out.println("Não!");
        }

    }

}
