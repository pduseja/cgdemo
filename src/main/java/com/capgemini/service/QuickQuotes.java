/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini.service;

import com.capgemini.*;
import com.capgemini.entity.Policy;
import com.capgemini.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author rashmsam
 */


public interface QuickQuotes {
    
     public QuoteEntity getQuote(Quote quote);
}
