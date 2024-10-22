package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class Main {

    public static boolean compar(double a, double b, double c)
    {
        return (a > b && b > c) || (a < b && b < c);
    }

    public static boolean chec(double[] array)
    {
        for(int i = 0; i < array.length - 2; ++i)
        {
            if(array.length < 3)
            {
                return true;
            }
            else {
                if (!compar(array[i], array[i + 1], array[i + 2]))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void insertSort(double[] array)
    {
        for(int i = 0; i < array.length; ++i)
        {
            double valu = array[i];
            int j = i - 1;
            for(; j >= 0; --j)
            {
                if(valu < array[j])
                {
                    array[j + 1] = array[j];
                }
                else
                {
                    break;
                }
            }
            array[j + 1] = valu;
        }
    }

    public static void unionArrays(double[] array1, double[] array2, double[] array3)
    {
        int i = 0, j = 0, a = 0;

        for(; a < array3.length;)
        {
            {
                if(i == array1.length)
                {
                    while(j < array2.length)
                    {
                        array3[a] = array2[j];
                        //System.out.println("j=" + j);
                        //System.out.println("a =" + a);
                        //System.out.println(array3.length);
                        a++;
                        j++;
                    }
                }
                else if(j == array2.length)
                {
                    while(i < array1.length)
                    {
                        array3[a] = array1[i];
                        //System.out.println("i =" + i);
                        //System.out.println("a =" + a);
                        //System.out.println(array3.length);
                        a++;
                        i++;
                    }
                }
                else {
                    if (array1[i] <= array2[j]) {

                        array3[a] = array1[i];
                        //System.out.println("i =" + i);
                        //System.out.println("a =" + a);
                        //System.out.println(array3.length);
                        ++a;
                        ++i;
                    }
                    else
                    {
                        array3[a] = array2[j];
                        //System.out.println("j=" + j);
                        //System.out.println("a =" + a);
                          //System.out.println(array3.length);
                        ++a;
                        ++j;
                    }
                }
            }
        }
    }

    public static int binarySearchMy(double[] array4, double key)
    {
        int left = 0, right = array4.length - 1;
        for(;;)
        {
            int mid = (right + left) / 2;
            if(key == array4[mid])
            {
                return mid;
            }
            else
            {
                System.out.println(mid);
                if(key > array4[mid])
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            }
        }
    }

    public static void mergeSort(double[] array)
    {
        if(array.length < 2)
        {
            return;
        }
        else {
            int mid = array.length / 2;
            double[] array1 = Arrays.copyOf(array, mid);
            double[] array2 = new double[array.length - mid];

            System.arraycopy(array, mid, array2, 0, array.length - mid);

            mergeSort(array1);
            mergeSort(array2);

            merge(array1, array2, array);
        }

    }

    public static void merge(double[] array1, double[] array2, double[] array)
    {
        int i = 0, j = 0, a = 0;

        while(i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]){
                array[a++] = array1[i++];
            }
            else {
                array[a++] = array2[j++];
            }
        }

        while(i < array1.length)
        {
            array[a++] = array1[i++];
        }

        while(j < array2.length){
            array[a++] = array2[j++];
        }
    }

    public static void main(String[] args) {

        double[] array = {3.1, 4.2, 6.3, 65.4, 87.6};

        if(chec(array))
        {
            System.out.println("Array is ordered");
        }
        else
        {
            System.out.println("Array not sorted");
        }

        double[] array1 = {1.0, 2.3, 5.7, 4.3, 7.5, 2.4, 3.4};
        System.out.println(Arrays.toString(array1));

        insertSort(array1);
        System.out.println(Arrays.toString(array1));

        double[] array11 = Arrays.copyOf(array1, array1.length);
        Arrays.sort(array11);
        System.out.println(Arrays.toString(array11));

        double[] array2 = {2.3, 4.6, 6.7, 8.7, 9.6, 12.4};
        double[] array3 = {3.5, 5.6, 7.5, 8.9, 9.7, 15.6};

        double[] array4 = new double[array2.length + array3.length];
        //System.out.println(array4.length);
        unionArrays(array2, array3, array4);

        System.out.println(Arrays.toString(array4));

        double[] array5 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};

        int ind = binarySearchMy(array5, 2);
        System.out.println(ind);

        double[] array6 = {2.3, 45.5, 98.4, 23.3, 43.7, 31.4, 23.4};
        System.out.println(Arrays.toString(array6));
        double[] array61 = Arrays.copyOf(array6, array6.length);
        mergeSort(array6);

        System.out.println(Arrays.toString(array6));
        Arrays.sort(array61);
        System.out.println(Arrays.toString(array61));

    }
}