package com.sy.common.pools;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 数据源绑定到当前线程
 * @author huchao
 *
 */
public class DataSourceRegister {
	
	private  static   Logger  logger = LoggerFactory.getLogger(DataSourceRegister.class);
	
	//当前线程
    private  static final  ThreadLocal<String>   datasources = new ThreadLocal<String>();
	
    public  static final  Set<String>   datasourcesid = new HashSet<String>();
     /**
     * 注册数据源
     * @param datasource
     */
    public static void setDataSources(String  datasource){
    	logger.info("绑定数据源到当前线程");
    	datasources.set(datasource);
    }
    
    /**
     * 获取数据源
     * @return
     */
    public static String   getDataSources(){
    	logger.info("从当前线程获取当前线程");
    	return datasources.get();
    }
    
    /**
     * 移除数据源
     * @return
     */
    public  static void removeDataSource(){
    	logger.info("从当前线程移除数据源");
    	datasources.remove();
    }
    
    /**
     * 判断当前数据源是否注册
     * @param DataSource
     * @return
     */
    public  static  boolean  containsDatasource(String DataSource){
    	logger.info("判断当前数据源是否注册");
    	return   datasourcesid.contains(datasources);
    }
}
