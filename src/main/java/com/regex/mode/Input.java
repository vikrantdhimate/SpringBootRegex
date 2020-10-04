package com.regex.mode;

public class Input
{
    String regex;
    String textBody;

    public Input()
    {

    }

    public String getRegex()
    {
        return regex;
    }

    public void setRegex(String regex)
    {
        this.regex = regex;
    }

    public String getTextBody()
    {
        return textBody;
    }

    public void setTextBody(String textBody)
    {
        this.textBody = textBody;
    }

    public Input(String regex, String textBody)
    {
        super();
        this.regex = regex;
        this.textBody = textBody;
    }

    @Override
    public String toString()
    {
        return "Input [regex=" + regex + ", textBody=" + textBody + "]";
    }

    
}
