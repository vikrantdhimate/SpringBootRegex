package com.regex.service;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.springframework.stereotype.Service;

@Service
public class RegexValidator
{
    public boolean validate(String regex)
    {
        try
        {
            Pattern.compile(regex);
        }
        catch (PatternSyntaxException exception)
        {
            System.err.println(exception.getDescription());
            return false;
        }
        return true;
    }
}
