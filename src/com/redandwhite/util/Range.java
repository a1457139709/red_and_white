/**
 * Array creation methods that can be used to generate integer from A to B
 * @author red_and_white
 */
package com.redandwhite.util;

public class Range {
    public static int[] range(int end)
    {
        int[] result = new int[end];
        for(int i = 0;i < end;i++)
            result[i] = i;
        return result;
    }
    public static int[] range(int begin, int end)
    {
        int arrayLength = end - begin;
        int[] result = new int[arrayLength];
        for(int i = 0;i < arrayLength;i++)
            result[i] =  begin + i;
        return result;
    }
    public static int[] range(int begin, int end, int step)
    {
        int arrayLength = (end - begin) / step;
        int[] result = new int[arrayLength];
        for(int i = 0;i < arrayLength;i++)
            result[i] =  begin + (i * step);
        return result;
    }
}
