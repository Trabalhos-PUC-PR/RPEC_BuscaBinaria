import java.util.Arrays;

public class BuscaBinaria {
    
    public static boolean exists(int[] list, int value){

        int middle = list.length/2;

        print(list);
        if(list.length == 1){
            if(list[0] == value){
                return true;
            }
            return false;
        }

        if(list[middle] != value){
            if(exists(split(list, value<list[middle]), value)){
                return true;
            }
        }else{
            return true;
        }
        return false;

    }

    private static int[] split(int[] list, boolean beginning){
        int fromIndex = 0;
        int toIndex = 0;
        if(beginning){
            fromIndex = 0;
            toIndex = list.length/2;
        }else{
            fromIndex = list.length/2;
            toIndex = list.length;
        }
        return Arrays.copyOfRange(list, fromIndex, toIndex);
    }

    private static void print(int[] list) {
        System.out.print('[');
        for(int i: list){
            System.out.print(i);
            if(i != list[list.length-1]){
                System.out.print(", ");
            }
        }
        System.out.println(']');
    }

}
