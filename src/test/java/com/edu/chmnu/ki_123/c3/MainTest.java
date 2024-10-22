package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void compar() {
        double [] arr = {1.0, 2.1, 2.4, 2.7, 2.9};
        assertTrue(Main.compar(arr[1], arr[2], arr[3]));
    }

    @Test
    void compar2() {
        double [] arr = {1.0, 2.1, 2.4, 2.7, 2.9, 2.3, 3.6};
        assertFalse(Main.compar(arr[4], arr[5], arr[6]));
    }

    @Test
    void chec() {
        double[] array = {2.1, 2.3, 5.3, 6.5, 7.5, 7.9};
        assertTrue(Main.chec(array));
    }

    @Test
    void chec2() {

        double[] array = {2.1, 5.4, 1.4, 5.3, 5.4, 6.7, 3.5, 7.9};
        assertFalse(Main.chec(array));
    }

    @Test
    void chec3() {
        double[] array = {2.1, 5.4};
        assertTrue(Main.chec(array));
    }

    @Test
    void checkInsertSort1() {
        double[] array = {2.0, 5.0, 3.0, 5.5, 3.0};
        double[] res = {2.0, 3.0, 3.0, 5.0, 5.5};
        Main.insertSort(array);
        assertArrayEquals(res, array);
    }

    @Test
    void checkInsertSort2() {
        double[] array = {2.0, 5.0, 3.0};
        double[] res = {2.0, 3.0, 5.0};
        Main.insertSort(array);
        assertArrayEquals(res, array);
    }

    @Test
    void checkInsertSort3() {
        double[] array = {3.0};
        double[] res = {3.0};
        Main.insertSort(array);
        assertArrayEquals(res, array);
    }

    @Test
    void testUnionArrays() {
        double[] array1 = {3.0, 4.67, 4.7, 29.5};
        double[] array2 = {2.5, 2.6, 4.7, 5.7};
        double[] array3 = new double[array1.length + array2.length];

        Main.unionArrays(array1, array2, array3);

        System.out.println(Arrays.toString(array3));

        double[] res = {2.5, 2.6, 3.0, 4.67, 4.7, 4.7, 5.7, 29.5};
        assertArrayEquals(res, array3);
    }

    @Test
    void testMefgeSort1() {
        double[] array = {4.67, 3.0, 4.7, 29.5};

        Main.mergeSort(array);

        //System.out.println(Arrays.toString(array3));

        double[] res = {3.0, 4.67, 4.7, 29.5};
        assertArrayEquals(res, array);
    }

    @Test
    void testMergeSort2() {
        double[] array = {2.3, 7.4, 2.4, 6.7, 8.7, 1.2, 34.5, 43.6};
        Main.mergeSort(array);

        double[] res = {1.2, 2.3, 2.4, 6.7, 7.4, 8.7, 34.5, 43.6};
        assertArrayEquals(res, array);
    }

    @Test
    void testMergeSort3() {
        double[] array = {};
        Main.mergeSort(array);

        double[] res = {};
        assertArrayEquals(res, array);
    }


}