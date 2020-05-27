/*
 * file name   : PartialMatchesFixture.java 
 * <br>copyright   : Copyright (c) 2018
 * <br>description : TODO<何时使用>[注意][示例]
 * <br>modified    : 
 * @author      <a href="mailto:thomas0927@163.com">Thomas Zhang</a>
 * @version     1.0
 * @date        2018年2月2日 下午2:35:00
 */ 

package com.agile1001.test.bdd;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.concordion.api.extension.Extensions;
import org.concordion.ext.LoggingTooltipExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

/*************************************************************************
 * description : 模糊匹配
 * @author      <a href="mailto:thomas0927@163.com">Thomas Zhang</a>
 * @date        2018年2月2日 下午2:35:00
 * @version     1.0             
 *************************************************************************/


@RunWith(ConcordionRunner.class)
@Extensions({LoggingTooltipExtension.class})
public class PartialMatchesFixture extends BaseFixture{

	private Set<String> usernamesInSystem = new HashSet<String>();

    public void setUpUser(String username) {
        usernamesInSystem.add(username);
    }

    /**
     * description : 模糊匹配
     * @param searchString 待查找的对象
     * @return	查找到的结果集
     * @author      <a href="mailto:thomas0927@163.com">Thomas Zhang</a>
     * @version     1.0
     * @date        2018年2月2日下午2:36:19
     */
    public Iterable<String> getSearchResultsFor(String searchString) {
        SortedSet<String> matches = new TreeSet<String>();
        for (String username : usernamesInSystem) {
            if (username.contains(searchString)) {
                matches.add(username);
            }
        }
        return matches;
    }
    
    public void setUpUsers(String usernames) {
    	String[] usernameArr=usernames.split(",");
    	for (String strname : usernameArr) {
    		usernamesInSystem.add(strname);
		}
    }
    
    public Iterable<String>  getSearchResultsForStr(String searchString) {
    	return getSearchResultsFor(searchString);
    }
}
