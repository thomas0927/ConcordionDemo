/*
 * file name   : BaseFixture.java 
 * <br>copyright   : Copyright (c) 2018
 * <br>description : TODO<何时使用>[注意][示例]
 * <br>modified    : 
 * @author      <a href="mailto:thomas0927@163.com">Thomas Zhang</a>
 * @version     1.0
 * @date        2018年2月8日 上午10:35:11
 */ 

package com.agile1001.test.bdd;

import org.concordion.api.extension.Extensions;
import org.concordion.ext.ParallelRunExtension;
import org.concordion.ext.timing.TimerExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

/*************************************************************************
 * description : TODO
 * @author      <a href="mailto:thomas0927@163.com">Thomas Zhang</a>
 * @date        2018年2月8日 上午10:35:11
 * @version     1.0             
 *************************************************************************/
@RunWith(ConcordionRunner.class)
@Extensions({TimerExtension.class,ParallelRunExtension.class})
public abstract class BaseFixture {

}
