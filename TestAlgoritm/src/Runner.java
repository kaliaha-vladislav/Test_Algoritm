import java.util.ArrayList;

public class Runner {
    public static void main(String[] arg){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        a.add(1);
        a.add(3);
        a.add(5);

        b.add(2);
        b.add(4);
        b.add(6);

        printArray(a);
        printArray(b);

        Algoritm algoritm = new Algoritm();
        a = algoritm.merge(b, a);
        System.out.println();
        printArray(b);
        System.out.println();
        //printArray(b);
    }

    public static void printArray(ArrayList<Integer> a){
        for(int element : a){
            System.out.println(element + " ");
        }
    }
}
