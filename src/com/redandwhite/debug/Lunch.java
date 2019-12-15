/**
 * dnwiadlsa
 * @author red_and_white
 */
package com.redandwhite.debug;
class Connection
{
    protected Connection(){}
}

class ConnectionManager
{
    private static Connection[] connectionArray = {new Connection()};

    public static Connection getConnection(int id)
    {
        if(id >= connectionArray.length || id < 0)
            return null;
        return connectionArray[id];
    }
}
public class Lunch
{
    public static void main(String[] args)
    {
      String s1,s2;
      s1 = new String("ddwad");
      s2 = new String("ddwad");
      if(s1.equals(s2))
          System.out.println("yes");
    }
}
