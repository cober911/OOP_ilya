package Seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassArrays<T> {
    private T[] array;

    public ClassArrays(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ClassArrays{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {
        ClassArrays<? extends Number> byteArray = new ClassArrays<>(new Byte[3]);
        ClassArrays<Double> doubleArray = new ClassArrays<>(new Double[2]);
        ClassArrays<Integer> integerArray = new ClassArrays<>(new Integer[2]);
        ClassArrays<? extends String> stringArray = new ClassArrays<>(new String[2]);

    }

}
