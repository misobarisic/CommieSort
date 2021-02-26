import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CommieSort {
    public static <T extends Comparable<T>> T[] sort(T[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                if (arr[i].compareTo(arr[i + 1]) >= 0) {
                    return sort(remove(i + 1, arr));
                }
            }
        }
        return arr;
    }

    private static <T> T[] remove(int index, T[] arr) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                list.add(arr[i]);
            }
        }
        return toArray(list);
    }

    private static <T> T[] toArray(List<T> list) {
        T[] arr = (T[]) Array.newInstance(list.get(0)
                .getClass(), list.size());
        IntStream.range(0, list.size()).forEach(i ->
                arr[i] = list.get(i));
        return arr;
    }

}
