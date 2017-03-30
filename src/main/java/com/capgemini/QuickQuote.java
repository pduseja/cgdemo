/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini;

import com.capgemini.service.QuickQuotes;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rashmsam
 */
@RestController
public class QuickQuote {
    
    @Autowired
    private QuickQuotes quickQuotes;
    
    @RequestMapping(value="/QQ",method=RequestMethod.POST)
    public String getQuote(@RequestBody Quote quote) {
        QuoteEntity qe = quickQuotes.getQuote(quote);
        return qe.getMessage();
    }
}
