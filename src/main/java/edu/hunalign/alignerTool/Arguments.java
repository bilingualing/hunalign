package edu.hunalign.alignerTool;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: jamaaltaylor
 * Date: 3/20/14
 * Time: 8:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class Arguments extends AnyData
{
    private HashMap<String, AnyData> argumentsMap;

    // Very important note: When read finds a numeric/set argument,
    // it sets anyData.kind to Int. But STILL, it fills anyData.dString,
    // just in case. So if the ArgumentMap was built by Arguments::read,
    // the dString fields are all filled.
    Boolean read( int argc, char argv )
    {

    }

    // remains is filled with the arguments not starting with '-'.
    Boolean read( int argc, char argv, ArrayList<Character> remains )
    {

    }

    // const if fails, erases arg if succeeds.
    Boolean getNumericParam(String argName, Integer num)
    {

    }

    // sw is true if the switch is present. The function
    // returns false if the argument value is not empty.
    Boolean getSwitch(String name, Boolean mySwitch )
    {

    }

    Boolean getSwitchConst(String name, Boolean mySwitch )
    {

    }

    // Returns true if the switch is present. Throws an error message if
    // if the argument value is not empty.
    Boolean getSwitchCompact(String name )
    {

    }

    void checkEmptyArgs()
    {

    }


}
