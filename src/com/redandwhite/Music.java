package com.redandwhite;
enum Note{
    MIDDLE_C,C_SHOCK
}
interface Instrument
{
    int VALUE = 5;
    Playable playable = new Playable() {
        @Override
        public void play(Note n) {
            System.out.println(this + ".play() " + n);
        }
    };
    void adjust();
}
interface Playable
{
    void play(Note n);
}
//abstract class WPSInstrument implements Instrument
//{
//    @Override
//    public void adjust()
//    {
//        System.out.println(this + ".adjust()");
//    }
//    @Override
//    public void play(Note n)
//    {
//
//    }
//    @Override
//    public abstract String toString();
//}
class Wind implements Instrument
{
    @Override
    public String toString() {
        return "Wind";
    }
    public void play(Note n)
    {
        System.out.println(this + ".play() " + n);
    }
    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}
class Percussion implements Instrument
{

    @Override
    public String toString() {
        return "Percussion";
    }
    public void play(Note n)
    {
        System.out.println(this + ".play() " + n);
    }
    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}
class Stringed implements Instrument
{
    @Override
    public String toString()
    {
        return "Stringed";
    }
    public void play(Note n)
    {
        System.out.println(this + ".play() " + n);
    }
    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}
public class Music {
    static void tune(Playable i)
    {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] is)
    {
        for(Instrument i : is)
            tune(i.playable);
    }

    public static void main(String[] args)
    {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed()
        };
        tuneAll(orchestra);
    }
}
