package com.regex.mode;

public class Output
{
    String match;
    boolean error;

    public Output()
    {
    }

    public Output(String match, boolean error)
    {
        super();
        this.match = match;
        this.error = error;
    }

    public String getMatch()
    {
        return match;
    }

    public void setMatch(String match)
    {
        this.match = match;
    }

    public boolean isError()
    {
        return error;
    }

    public void setError(boolean error)
    {
        this.error = error;
    }

    @Override
    public String toString()
    {
        return "Output [match=" + match + ", error=" + error + "]";
    }

    
}
