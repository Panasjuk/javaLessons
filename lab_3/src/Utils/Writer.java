package Utils;

import java.util.List;

public class Writer {
    public void writeList(List<Integer> outList){
        for (int i:outList) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void writeArray(int[] array){
        for (int i:array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
