package edu.hunalign.alignerTool;

/**
 * Created with IntelliJ IDEA.
 * User: jamaaltaylor
 * Date: 3/16/14
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class alignerTool
{
    public void mainAlignerToolUsage()
    {
        System.out.println(help.helpString);
    }

    public int mainAlignerTool(int argC, char[] argV)
    {
        if(argC<4)
        {
            mainAlignerToolUsage();
            return 0;
        }

        Arguments args;
    }
}
