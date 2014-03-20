package edu.hunalign.alignerTool;

public class AnyData
{
    public enum Kind{INT, STRING, FLOAT, SET};

    public Kind kind;
    public Integer dInt;
    public String dString;

    public AnyData()
    {
        this.kind = Kind.STRING;
        this.dInt = -1;
    }

    public AnyData(Integer myInt)
    {
        this.kind = Kind.INT;
        this.dInt = myInt;
    }

    public AnyData(String myString)
    {
        this.kind = Kind.STRING;
        this.dInt = -1;
        this.dString = myString;
    }
}
