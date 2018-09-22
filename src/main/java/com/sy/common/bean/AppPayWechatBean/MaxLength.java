package com.sy.common.bean.AppPayWechatBean;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
/**
 * 用于检查字段长度
 * @author lizhenzhong 
 * @Date   2017.05.31
 */
public @interface MaxLength {
  int value();
}