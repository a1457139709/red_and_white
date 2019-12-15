import static com.redandwhite.util.Print.*;
interface Game
{
    void What();
    class Test
    {
        public static void Thankt(Game game)
        {
            game.What();
        }
    }
}
class Outer
{

    class Inner
    {
        private int value;
        public Inner(int i)
        {
            value = i;
            System.out.println(value);
        }

    }
}
class ExtendInner extends Outer.Inner
{
    ExtendInner(int i,Outer outer)
    {
        outer.super(i);
    }
}
public class JavaLearn
{
    private static class Chess  implements Game
    {
        private final String name = getClass().getSimpleName();
        @Override
        public void What()
        {
            System.out.println(name);
        }
    }
    protected static class Shoot implements Game
    {
        private final String name = getClass().getSimpleName();
        @Override
        public void What()
        {
            System.out.println(name);
        }
        private static int value = 4;
        public static int getValue()
        {
            return value;
        }
        static class DShoot
        {
            private String label;
            public DShoot()
            {
                label = null;
                print("label is null");
            }
            public DShoot(String s)
            {
                label = s;
                print("lable is " + label);
            }
        }
    }
    public static Chess getChess()
    {
        return new Chess();
    }
    public static Shoot getShoot()
    {
        return new Shoot();
    }
    public static void main(String[] args)
    {
        Outer o = new Outer();
        ExtendInner ei = new ExtendInner(1,o);
    }

}
