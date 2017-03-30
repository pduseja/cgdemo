/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capgemini.service;

import com.capgemini.*;
import com.capgemini.entity.Policy;
import com.capgemini.entity.User;
import java.util.Date;
import java.util.Random;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rashmsam
 */
@Service
@Transactional
public class QuickQuotesImpl implements QuickQuotes{
    
    
    @Autowired
    private  PolicyRepository policyRepository;
    
    @Autowired
    private  UserRepository userRepository;
    
    private void addUser(User user) {
        if (user!=null){
            this.userRepository.save(user);
        }
    }

    
    private void addPolicy(Policy policy) {
        if (policy!=null){
            this.policyRepository.save(policy);
        }
    }
    
    public QuoteEntity getQuote(Quote quote){        
        
        QuoteEntity qe= new QuoteEntity();
        User user = new User();
        Policy policy = new Policy();
        try{   
           System.out.println("quote.getAge()"+ quote.getAge());
            user.setAge(quote.getAge());
            user.setFirstName(quote.getFirstName());
            user.setLastName(quote.getLastName());
            user.setSmokerFlag(quote.getSmokerFlag());
            user.setState(quote.getState());
            user.setUserName(quote.getUserName());
            this.addUser(user);
            
            
            policy.setPolicyDate(new Date());
            policy.setPolicyId(new Random().nextLong());
            policy.setPremium(quote.getSumAssured()/(quote.getTerm()*12));
            policy.setTerm(quote.getTerm());
            policy.setStatus('A');
            policy.setUser(user);
            this.addPolicy(policy);  
             qe.setMessage( " Success!!! Your Quote is :"+ policy.getPremium());
        }catch(Exception e){
            e.printStackTrace();
            qe.setMessage("Error: " + e.getMessage());
        }
       
        return qe;
    }

}
