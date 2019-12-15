package com.redandwhite.interfaces.FileAdapter;
import com.redandwhite.interfaces.interfaceprocess.*;
class ExcSAdapter implements Processor
{
    private ExString exString;
    ExcSAdapter()
    {
        this.exString = new ExString();
    }
    @Override
    public String name()
    {
        return getClass().getSimpleName();
    }
    @Override
    public Object process(Object object)
    {
        return exString.exchangeChar((String)object);
    }
}
class ExString
{
    public String exchangeChar(String str)
    {
//        String result = new String();
//        int length = str.length();
//        int i;
//        for(i = 0;i <= length / 2;i++)
//        {
//            result += str.charAt(2 * i + 1);
//            result += str.charAt(2 * i);
//        }
//        i *= 2;
//        while(++i < length)
//            result += str.charAt(i);
//
//        return result;
        return "redas";
    }
}
public class ExchangeString
{
    public static void main(String[] str)
    {
        Apply.process(new ExcSAdapter(),"zeds");
    }
}
