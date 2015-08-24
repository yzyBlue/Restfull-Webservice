package com.test.ssm.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ������֤
 * 
 * @author Yuan.Ziyang
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
public @interface DataValidate {
	// �Ƿ����Ϊ��
	boolean nullable() default false;

	// ���������ֶ�����,�����ܹ���ʾ�Ѻõ��쳣��Ϣ
	String description() default "";
}
