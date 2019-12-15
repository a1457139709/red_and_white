/**
 * @author red_and_white
 * @version 1.0
 */

package com.redandwhite.innerclasses.controller;
import com.redandwhite.innerclasses.controller.*;
public class GreenhouseControls extends Controller
{
    private boolean wind = false;
    public class WindOn extends Event
    {
        /**
         *
         * @param delayTime to create Event
         */
        public WindOn(long delayTime)
        {
            super(delayTime);
        }
        @Override
        public void action()
        {
            wind = true;
        }
        @Override
        public String toString()
        {
            return "Wind now is on";
        }
    }
    public class WindOff extends Event
    {
        public WindOff(long delayTime)
        {
            super(delayTime);
        }
        @Override
        public void action()
        {
            wind = false;
        }
        @Override
        public String toString()
        {
            return "Wind now is off";
        }
    }
    public class Bell extends Event
    {
        public Bell(long delayTime)
        {
            super(delayTime);
        }
        @Override
        public void action()
        {
            addEvent(new Bell(delayTime));
        }
        @Override
        public String toString()
        {
            return "Bing!";
        }
    }
    public class Restart extends Event
    {
        private Event[] events;
        public Restart(Event[] eventList,long delayTime)
        {
            super(delayTime);
            int length = eventList.length;
            events = new Event[length];
            for(int i = 0;i < length;i++)
                events[i] = eventList[i];
        }

        @Override
        public void action()
        {
            for(Event e : events)
            {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        @Override
        public String toString()
        {
            return "Restart system";
        }
    }
    public static class Terminate extends Event
    {
        public Terminate(long delayTime)
        {
            super(delayTime);
        }
        @Override
        public void action()
        {
            System.exit(0);
        }
        @Override
        public String toString()
        {
            return "Exit";
        }
    }
}
