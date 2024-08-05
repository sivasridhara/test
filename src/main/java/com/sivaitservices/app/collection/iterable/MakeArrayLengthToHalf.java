
package siva.collection.iterable;
import java.util.Arrays;
import java.util.List;

public class MakeArrayLengthToHalf {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        int length = list.size();
        int mid =((0+length)>>>1) & ~1;

        System.out.println(mid);
    }
}
