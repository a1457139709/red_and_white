package com.redandwhite.interfaces;
import com.redandwhite.debug.*;
public class Prot {
    protected class Injoke implements Protest6
    {
        @Override
        public void What()
        {
            System.out.println("Injoke HAHAHAHAHAHA");
        }
    }
    protected Injoke injoke()
    {
        return new Injoke();
    }
}
class UpTram extends Prot
{
    public Protest6 getInjoke()
    {
        return new Injoke();
    }
}
