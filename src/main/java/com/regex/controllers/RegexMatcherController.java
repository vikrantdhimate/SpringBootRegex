package com.regex.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.regex.mode.Input;
import com.regex.mode.Output;
import com.regex.service.RegexService;
import com.regex.service.RegexValidator;

@RestController
public class RegexMatcherController
{

    @Autowired
    RegexValidator validator;

    @Autowired
    RegexService service;

    @RequestMapping(value = "/regexmatcher", method = RequestMethod.POST)
    public Output persistPerson(@RequestBody Input input)
    {
        System.out.println("Input :"+ input);

        Output result = new Output();
        String match = null;

        if (validator.validate(input.getRegex()))
        {
            match = service.match(input.getRegex(), input.getTextBody());
            if (!StringUtils.isEmpty(match))
            {
                result.setMatch(match);
            }
        }
        else
        {
            result.setError(true);
        }
        System.out.println("Output :"+ result);
        return result;
    }

}
