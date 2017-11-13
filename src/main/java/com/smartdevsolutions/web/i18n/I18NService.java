package com.smartdevsolutions.web.i18n;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

@Configuration
public class I18NService {

    @Autowired
 public MessageSource messageSource;

    private static final Logger LOG = LoggerFactory.getLogger(I18NService.class); 
    
    public String getMessage(String messageId)
    {
        LOG.info("returning 18n text from messageId {}",messageId);
        Locale locale = LocaleContextHolder.getLocale();
        return  getMessage(messageId, locale);
    }

    public String getMessage(String messageId, Locale locale)
    {

        return  messageSource.getMessage(messageId,null, locale);
    }

}
