package Arrays.Logical_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class LearningArrayList {
    static void main() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, 2);
        list.add(1, 4);
        list.add(2, 7);
        list.add(3, 9);
        list.add(3, 12);
        list.add(0, 100);
        System.out.println("This is our ArrayList :- ");
        System.out.println(list);

        int result[] = new int[6];
        for(int i=0;i< result.length;i++){
            result[i]=list.get(i);
        }
        System.out.println("This is an Array :- ");
        System.out.println(Arrays.toString(result));
    }
}
