import java.util.ArrayList;

public class CommieSort {
    public static Integer[] sort(Integer[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                if (arr[i] >= arr[i + 1]) {
                    return sort(toIntArray(remove(i + 1, arr)));
                }
            }
        }
        return arr;
    }

    public static Double[] sort(Double[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                if (arr[i] >= arr[i + 1]) {
                    return sort(toDoubleArray(remove(i + 1, arr)));
                }
            }
        }
        return arr;
    }

    private static Object[] remove(int index, Object[] arr) {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                list.add(arr[i]);
            }
        }
        return list.toArray(new Object[0]);
    }

    private static Integer[] toIntArray(Object[] arr) {
        int length = arr.length;
        Integer[] intArr = new Integer[length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = (int) arr[i];
        }
        return intArr;
    }

    private static Double[] toDoubleArray(Object[] arr) {
        int length = arr.length;
        Double[] intArr = new Double[length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = (double) arr[i];
        }
        return intArr;
    }
}
