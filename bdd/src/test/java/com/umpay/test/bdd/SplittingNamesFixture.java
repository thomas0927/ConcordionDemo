package com.umpay.test.bdd;

import org.concordion.api.MultiValueResult;
import org.concordion.api.extension.Extensions;
import org.concordion.ext.timing.TimerExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@Extensions(TimerExtension.class)
public class SplittingNamesFixture {
	
    public MultiValueResult split(String fullName) {
        String[] words = fullName.split(" ");
        return new MultiValueResult()
                .with("firstName", words[0])
                .with("lastName", words[1]);
    }
}