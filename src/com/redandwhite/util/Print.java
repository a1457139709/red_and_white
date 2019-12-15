//: com/redandwhite/util/Print/java
/*
 * Print methods that can be used without
 * qualifiers, using Java SE13 static import
 */
package com.redandwhite.util;
import java.io.*;

public class Print {
    //print with a newline
    public static void print(Object obj)
    {
        System.out.println(obj);
    }
    public static void print()
    {
        System.out.println();
    }
    // print without a newline
    public static void printnb(Object obj)
    {
        System.out.print(obj);
    }
    public static PrintStream printf(String format, Object... args)
    {
        return System.out.printf(format, args);
    }
}
