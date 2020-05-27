package com.agile1001.test.bdd;

import org.concordion.api.MultiValueResult;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
@RunWith(ConcordionRunner.class)
public class SplittingNamesFixture extends BaseFixture {
	
	
	
    public MultiValueResult split(String fullName) {
        String[] words = fullName.split(" ");
        return new MultiValueResult()
                .with("firstName", words[0])
                .with("lastName", words[1]);
    }
    
    public String merge(String firstName,String lastName){
    	return String.format("%s %s", firstName,lastName);
    }
}