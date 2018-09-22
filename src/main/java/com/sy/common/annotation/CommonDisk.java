package com.sy.common.annotation;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据字典类，
 * @author yumeng
 * 写入缓存；暂时简单处理下
 */
public class CommonDisk {
	/*写入缓存；暂时简单处理下
	1:物  2：人 
	物品类型：1：手表  2：包  3 箱子 4 证件
	性别：1 男 2女
	*/
	
   @SuppressWarnings({ "rawtypes", "unchecked" })
public static Map sydisk(){
	  Map disk=new HashMap();
	  
	  //人物分类，性别
	  disk.put("sex1", "1");//男
	  disk.put("sex2", "2");//女
	  
	  
	  //物品分类
	  disk.put("item1", "手表");
	  disk.put("item2", "包");
	  disk.put("item3", "箱子");
	  disk.put("item4", "证件");
	  disk.put("item5", "玩具");
	  
	  //类型
	  disk.put("type1", "物");
	  disk.put("type2", "人");
	  
	  //消息状态
	  disk.put("message1", "已发布");
	  disk.put("message2", "已找到");
	  disk.put("message3", "已悬赏");
	  disk.put("message4", "已关闭");
	  disk.put("message5", "已删除");

	  //民族1
	  disk.put("nation1", "汉族");
	  disk.put("nation2", "满族");
	  disk.put("nation3", "回族");
	  disk.put("nation4", "白族");
	  disk.put("nation5", "朝鲜族");
	  disk.put("nation6", "蒙古族");
	  
	  //民族2
	  disk.put("汉族","nation1");
	  disk.put("满族","nation2");
	  disk.put("回族","nation3");
	  disk.put("白族","nation4");
	  disk.put("朝鲜族","nation5");
	  disk.put("蒙古族","nation6");
	  
	  //证件类型
	  disk.put("peopletype1","身份证");
	  disk.put("peopletype2","学生证");
	  disk.put("peopletype3","户口本");
	  disk.put("peopletype4","军官证");
	  disk.put("peopletype5","护照");
	  disk.put("peopletype6","结婚证");
	  
	  
	  return disk;
   }
}
