import java.util.Arrays;
public class Main {
    static boolean isFind(int[] arr,int value) {
        for (int i : arr) {
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] list = {3,10,7,3,3,2,9,10,21,2,33,9,1,0,0};

        int startIndex = 0;

        int[] duplicate = new int[list.length];

        for(int i = 0; i < list.length;i++){
            for(int j = 0; j < list.length; j++){
                if( (i!=j) && (list[i] == list[j]) ){
                    if ((list[i] % 2 == 0) && (!isFind(duplicate,list[i]))) {
                        duplicate[startIndex++]= list[i];
                        break;
                    }
                }
            }
        }

        for(int i = 0 ; i < list.length; i++){
            if(list[i] == 0){
                System.out.print("0 ");
                break;
            }
        }
        Arrays.sort(duplicate);

        for(int value : duplicate){
            if(value != 0){
                System.out.print(value + " ");
            }
        }


    }
}
