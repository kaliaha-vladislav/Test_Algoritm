import java.util.ArrayList;

public class Algoritm {

    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        for(int element : b){
            a.add(getIndex(a, element), element );
        }
        return a;
    }

    private int getIndex(ArrayList<Integer> array,  int key){
        if(array == null) {
            return -1;
        }

        int low = 0;
        int high = array.size() - 1;

        while(true) {
            int middle = low + (high - low) / 2;

            int middleItem = array.get(middle);

            if(middle - 1 != -1 && key < middleItem && key > array.get(middle - 1)) {
                return middle;
            } else if (middle + 1 != array.size() && key > middleItem && key < array.get(middle + 1)) {
                return middle + 1;
            } else if(middle - 1 <= -1){
                return middle;
            } else if(key < middleItem){
                high = middle - 1;
            } else if(middle + 1 != array.size()){
                low = middle + 1;
            } else if (middle + 1 == array.size()){
                return middle + 1;
            } else {
                return middle;
            }

        }
    }


}
