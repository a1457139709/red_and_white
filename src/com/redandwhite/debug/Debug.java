package com.redandwhite.debug;
class aa
{
    public aa()
    {
        System.out.println("Creating");
    }
}
public class Debug
{
    public Debug()
    {
        System.out.println("Creating");
    }
    public static void debug(String[] args)
    {
        for(String arg : args)
            System.out.print(arg + " ");
        System.out.println();
    }
}
