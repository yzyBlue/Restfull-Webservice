package com.test.ssm.util;

import java.lang.reflect.Field;

import org.apache.log4j.Logger;

import com.test.ssm.model.IntegrationResult;

/**
 * ע�����
 * 
 * @author Yuan.Ziyang
 * 
 */
public class DataValidationUtil {
	protected final Logger logger = Logger.getLogger(this.getClass());
	private static DataValidate dataValidate;

	public DataValidationUtil() {
		super();
	}

	public static IntegrationResult validate(Object object) {
		IntegrationResult integrationResult = new IntegrationResult();
		// ��ȡobject������
		Class<? extends Object> clazz = object.getClass();
		// ��ȡ�����������ĳ�Ա
		Field[] fields = clazz.getDeclaredFields();
		// ��������
		String descpList = "";
		int code = 0;
		try {
			for (Field field : fields) {
				// ����private˽�л��ĳ�Ա������ͨ��setAccessible���޸�������Ȩ��
				field.setAccessible(true);
				// integrationResult = dataValidation(field, object);
				String description;
				Object value;
				dataValidate = field.getAnnotation(DataValidate.class);
				value = field.get(object);
				if (dataValidate != null) {
					description = dataValidate.description().equals("") ? field
							.getName() : dataValidate.description();
					System.out.println(description + " : " + value);
					if (value == null || isBlank(value.toString())) {
						descpList = descpList + description + ",";
						code = 1;
					}
				}
				// �������û�˽��Ȩ��
				field.setAccessible(false);
			}
			if (code == 1) {
				integrationResult.setResultCode(code);
				integrationResult.setResultDesc(descpList + "����Ϊ��");
			} else {
				integrationResult.setResultCode(code);
				integrationResult.setResultDesc("������֤ͨ��");
			}
		} catch (Exception e) {
			integrationResult.setResultCode(IntegrationResult.INTERNALERROR);
			integrationResult.setResultDesc(IntegrationResult.INTERNALDESC
					+ ":" + e.toString());
		}
		return integrationResult;
	}

	/**
	 * <p>
	 * �ж��ַ����Ƿ���""," ",null
	 * </p>
	 * 
	 * <pre>
	 * isBlank(null)      = true
	 * isBlank("")        = true
	 * isBlank(" ")       = true
	 * isBlank("bob")     = false
	 * isBlank("  bob  ") = false
	 * </pre>
	 */
	public static boolean isBlank(String str) {
		int strLen;
		if (str == null || (strLen = str.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((Character.isWhitespace(str.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

}
