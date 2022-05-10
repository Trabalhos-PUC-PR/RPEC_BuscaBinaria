import java.util.Arrays;

public class BuscaBinaria {
    
    public static boolean exists(int[] list, int value){

        System.out.println("Tamanho: "+list.length);

        // esse middle nn rola, soma do begin até o meio, faz a média e manda -1 (se impar?)
        int middle = (int)((list.length -1)/2);

        System.out.println("middle: "+middle);

        int begin = 0;
        int end = middle;

        if(middle < 0){
            return false;
        }

        if(value == list[middle]){
            return true;
        }else{
            if(list[middle] < value){
                System.out.printf("valor %d MAIOR que %d\n", value, list[middle]);
                begin = middle;
                end = list.length - 1;
                System.out.printf("begin %d, end %d\n\n", begin, end);
            }
            if(exists(Arrays.copyOfRange(list, begin, end), value)){
                return true;
            }
        }

        return false;
    }

}
