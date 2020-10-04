package com.regex.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class RegexService
{
    public String match(String regex, String textBody)
    {
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(textBody);
        if (matcher.find())
        {
            return matcher.group();
        }
        return "";
    }
}
