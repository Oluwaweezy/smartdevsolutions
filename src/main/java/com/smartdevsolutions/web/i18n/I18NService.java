package com.smartdevsolutions.web.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

@Configuration
public class I18NService {

    @Autowired
 public MessageSource messageSource;

    public String getMessage(String messageId)
    {
        Locale locale = LocaleContextHolder.getLocale();
        return  getMessage(messageId, locale);
    }

    public String getMessage(String messageId, Locale locale)
    {

        return  messageSource.getMessage(messageId,null, locale);
    }

}
