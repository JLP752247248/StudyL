package com.couldtec.webserver.util;

/**
 * @(#)com.linkage.litms.acs.common.utils.StringUtil.java
 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * common util for String.
 * <P>
 * Linkage Communication Technology Co., Ltd
 * <P>
 * <P>
 * Copyright 2005-2007. All right reserved.
 * <P>
 * 
 * @version 1.0.0 2007-4-12
 * @author Alex.Yan (yanhj@lianchuang.com)
 */
@SuppressWarnings("rawtypes")
public class StringUtil {

	/** log */
	private static final Logger logger = LoggerFactory
			.getLogger(StringUtil.class);

	/**
	 * Constractor
	 */
	public StringUtil() {
	}

	/**
	 * get String Value of list.
	 * 
	 * @param list
	 * @param index
	 * @return
	 */
	public static String getStringValueofList(ArrayList list, int index) {
		if (null == list) {
			return null;
		}

		if (index < 0) {
			return null;
		}

		return (String) list.get(index);
	}

	/**
	 * get String Value of list.
	 * 
	 * @param list
	 * @param index
	 * @param def_value
	 * @return
	 */
	public static String getStringValueofList(ArrayList list, int index,
			String def_value) {

		String value = "";

		value = StringUtil.getStringValueofList(list, index);
		if (null == value) {
			return def_value;
		} else {
			return value;
		}
	}

	/**
	 * get int Value of list.
	 * 
	 * @param list
	 * @param index
	 * @return
	 */
	public static int getIntValueOfList(ArrayList list, int index) {

		int value = 0;

		String tmp = StringUtil.getStringValueofList(list, index);
		if (null == tmp) {
			return value;
		} else {
			try {
				value = Integer.parseInt(tmp);
			} catch (NumberFormatException e) {
				logger.error("{}", e);
			}

			return value;
		}
	}

	/**
	 * Get string value of Map from db
	 * 
	 * @param map
	 * @param columName
	 * @return
	 */
	public static String getStringValue(Map map, String columName) {

		if (null == columName) {
			return null;
		}

		if (null == map) {
			return null;
		}

		if (null == map.get(columName)) {
			return null;
		}

		return map.get(columName).toString();
	}

	/**
	 * Get string value of Map from db. if null, return def_value.
	 * 
	 * @param map
	 * @param columName
	 * @param def_value
	 * @return
	 */
	public static String getStringValue(Map map, String columName,
			String def_value) {

		String tmp = StringUtil.getStringValue(map, columName);
		if (null == tmp) {
			return def_value;
		} else {
			return tmp;
		}
	}

	/**
	 * Get int value of Map from db
	 * 
	 * @param map
	 * @param columName
	 * @return
	 */
	public static int getIntValue(Map map, String columName) {
		int value = 0;

		String tmp = StringUtil.getStringValue(map, columName);

		if (null == tmp || "".equals(tmp)) {
			return value;
		}

		try {
			value = Integer.parseInt(tmp);
		} catch (NumberFormatException e) {
			logger.error("{}", e);
		}

		return value;
	}

	/**
	 * Get int value of Map from db.
	 * 
	 * @param map
	 *            -Map.
	 * @param columName
	 *            -String.
	 * @param def_value
	 *            -int default value.
	 * @return -int
	 */
	public static int getIntValue(Map map, String columName, int def_value) {
		int value = def_value;

		String tmp = StringUtil.getStringValue(map, columName);

		if (null == tmp) {
			return value;
		}

		try {
			value = Integer.parseInt(tmp);
		} catch (NumberFormatException e) {
			logger.error("{}", e);
		}

		return value;
	}

	/**
	 * Get long value of Map from db
	 * 
	 * @param map
	 * @param columName
	 * @return
	 */
	public static long getLongValue(Map map, String columName) {
		long value = 0;

		String tmp = StringUtil.getStringValue(map, columName);

		if (null == tmp) {
			return value;
		}

		try {
			value = Long.parseLong(tmp);
		} catch (NumberFormatException e) {
			logger.error("{}", e);
		}

		return value;
	}

	/**
	 * Get long value of Map from db
	 * 
	 * @param map
	 * @param columName
	 * @param defValue
	 * @return
	 */
	public static long getLongValue(Map map, String columName, long defValue) {
		long value = defValue;

		String tmp = StringUtil.getStringValue(map, columName);

		if (null == tmp) {
			return value;
		}

		try {
			value = Long.parseLong(tmp);
		} catch (NumberFormatException e) {
			logger.error("{}", e);
		}

		return value;
	}

	/**
	 * Get double value of Map from db.
	 * 
	 * @param map
	 * @param columName
	 * @return
	 */
	public static double getDoubleValue(Map map, String columName) {
		double value = 0;

		String tmp = StringUtil.getStringValue(map, columName);

		if (null == tmp) {
			return value;
		}

		try {
			value = Double.parseDouble(tmp);
		} catch (NumberFormatException e) {
			logger.error("{}", e);
		}

		return value;
	}

	/**
	 * Get string value of list from db
	 * 
	 * @param list
	 * @param index
	 * @param columName
	 * @return
	 */
	public static String getStringValue(ArrayList list, int index,
			String columName) {
		if (null == list) {
			return null;
		}

		if (null == columName) {
			return null;
		}

		Map map = (Map) list.get(index);
		if (null == map) {
			return null;
		}

		return (String) map.get(columName);
	}

	/**
	 * 
	 * @param list
	 * @param index
	 * @param columName
	 * @param defValue
	 * @return
	 */
	public static String getStringValue(ArrayList list, int index,
			String columName, String defValue) {
		if (null == list) {
			return defValue;
		}

		if (null == columName) {
			return defValue;
		}

		Map map = (Map) list.get(index);
		if (null == map) {
			return defValue;
		}

		if (null == (String) map.get(columName)) {
			return defValue;
		} else {
			return (String) map.get(columName);
		}
	}

	/**
	 * Get int value of list from db
	 * 
	 * @param list
	 * @param index
	 * @param columName
	 * @return
	 */
	public static int getIntValue(ArrayList list, int index, String columName) {

		int value = 0;

		String tmp = StringUtil.getStringValue(list, index, columName);

		if (null == tmp || 0 == tmp.trim().length()) {
			return value;
		}

		try {
			value = Integer.parseInt(tmp.trim());
		} catch (NumberFormatException e) {
			logger.error("{}", e);
		}

		return value;
	}

	/**
	 * Get long value of list from db
	 * 
	 * @param list
	 * @param index
	 * @param columName
	 * @return
	 */
	public static long getLongValue(ArrayList list, int index, String columName) {
		long value = 0;

		String tmp = StringUtil.getStringValue(list, index, columName);

		if (null == tmp || 0 == tmp.trim().length()) {
			return value;
		}

		try {
			value = Long.parseLong(tmp.trim());
		} catch (NumberFormatException e) {
			logger.error("{}", e);
		}

		return value;
	}

	/**
	 * 
	 * @param list
	 * @param index
	 * @param columName
	 * @return
	 */
	public static double getDoubleValue(ArrayList list, int index,
			String columName) {
		double value = 0.0;

		String tmp = StringUtil.getStringValue(list, index, columName);

		if (null == tmp || 0 == tmp.trim().length()) {
			return value;
		}

		try {
			value = Double.parseDouble(tmp.trim());
		} catch (NumberFormatException e) {
			logger.error("{}", e);
		}

		return value;
	}

	/**
	 * parse string to int.
	 * 
	 * @param value
	 *            value to be parsed.
	 * @param defValue
	 *            default value
	 * @return
	 */
	public static int parseInt(String value, int defValue) {

		if (null == value || 0 == value.trim().length()) {
			return defValue;
		}

		try {
			return Integer.parseInt(value.trim());
		} catch (NumberFormatException e) {
			return defValue;
		}

	}

	/**
	 * parse string to int.
	 * 
	 * @param value
	 *            value to be parsed.
	 * @return
	 */
	public static int parseInt(String value) {

		return StringUtil.parseInt(value, 0);
	}

	/**
	 * parse string to long.
	 * 
	 * @param value
	 *            value to be parsed.
	 * @param defValue
	 *            default value
	 * @return
	 */
	public static long parseLong(String value, long defValue) {

		if (null == value || 0 == value.trim().length()) {
			return defValue;
		}

		try {
			return Long.parseLong(value.trim());
		} catch (NumberFormatException e) {
			return defValue;
		}

	}

	/**
	 * parse string to long.
	 * 
	 * @param value
	 *            value to be parsed.
	 * @return
	 */
	public static long parseLong(String value) {

		return StringUtil.parseLong(value, 0);
	}

	/**
	 * parse string to double.
	 * 
	 * @param value
	 *            value to be parsed.
	 * @param defValue
	 *            default value
	 * @return
	 */
	public static double parseDouble(String value, double defValue) {

		if (null == value || 0 == value.trim().length()) {
			return defValue;
		}

		try {
			return Double.parseDouble(value.trim());
		} catch (NumberFormatException e) {
			return defValue;
		}

	}

	/**
	 * parse string to double.
	 * 
	 * @param value
	 *            value to be parsed.
	 * @return
	 */
	public static double parseDouble(String value) {

		return StringUtil.parseDouble(value, 0.00);
	}

	/**
	 * parse string to boolean.
	 * 
	 * @param value
	 *            value to be parsed.
	 * @param defValue
	 *            default value
	 * @return
	 */
	public static boolean parseBoolean(String value) {

		if (null != value && value.equals("true")) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * get sub string array. eg. string:"111%d%%dddd%";reg:"%"; retrun
	 * {"d","dddd"}
	 * 
	 * @param string
	 * @param reg
	 * @return
	 */
	public static String[] getSubStrArr(String string, String reg) {

		if (string == null || reg == null) {
			return null;
		}

		// string = string.replaceAll("%%", "% %");
		String[] arr = string.split(reg);
		if (arr == null || arr.length == 1) {
			logger.debug("arr == null || arr.length == 1");
			return null;
		}

		/**
		 * 
		 */
		if(arr.length%2==0){
			return null;
		}
		
		if (null != arr && arr.length > 0) {
			String[] strArr = new String[arr.length / 2];
			for (int i = 1; i < arr.length; i += 2) {
				strArr[i / 2] = arr[i];
			}

			arr = null;

			return strArr;
		}

		return null;
	}

	/**
	 * 
	 * @param rpc
	 * @return
	 */
	public static int getFaultCode(String rpc) {
		if (null == rpc) {
			return 0;
		}

		int a = rpc.indexOf("<FaultCode>");
		if (a > -1 && rpc.length() >= (a + 15)) {
			return StringUtil.parseInt(rpc.substring(a + 11, a + 15));
		}

		return 0;
	}

	/**
	 * 
	 * @param text
	 * @return
	 */
	public static String asHTML(String text) {
		if (text == null)
			return "";
		StringBuffer results = null;
		char[] orig = null;
		int beg = 0, len = text.length();
		for (int i = 0; i < len; ++i) {
			char c = text.charAt(i);
			switch (c) {
			case 0:
			case '&':
			case '<':
			case '>':
			case '"':
				if (results == null) {
					orig = text.toCharArray();
					results = new StringBuffer(len + 10);
				}
				if (i > beg)
					results.append(orig, beg, i - beg);
				beg = i + 1;
				switch (c) {
				default: // case 0:
					continue;
				case '&':
					results.append("&");
					break;
				case '<':
					results.append("<");
					break;
				case '>':
					results.append(">");
					break;
				case '"':
					results.append("");
					break;
				}
				break;
			}
		}
		if (results == null)
			return text;
		results.append(orig, beg, len - beg);
		return results.toString();
	}

	/**
	 * SQL:??????sql???????????????.?????????????????????
	 * <li>tmp???null:?????? null</li>
	 * <li>tmp???"",flag???true: ??????null</li>
	 * <li>tmp???null???"",??????"'" + tmp + "'"</li>
	 * 
	 * @param tmp
	 * @param flag
	 * @return
	 */
	public static String getSQLString(String tmp, boolean flag) {
		if (tmp == null) {
			return null;
		}

		if (tmp.equals("") && flag == true) {
			return null;
		}

		return "'" + tmp + "'";
	}

	/**
	 * SQL:??????sql???????????????, ?????????????????????
	 * <li>tmp???null??????'':?????? null</li>
	 * <li>???????????? :"'" + tmp + "'"</li>
	 * 
	 * @param tmp
	 * @return
	 */
	public static String getSQLString(String tmp) {
		return StringUtil.getSQLString(tmp, true);
	}

	/**
	 * ??????????????????????????????
	 * 
	 * @param tem
	 *            ?????????????????????
	 * @param flag
	 *            ??????tem??????null???????????????????????????.
	 * @return
	 *            <li>true: ??????</li>
	 *            <li>false:?????????</li>
	 */
	public static boolean IsEmpty(String tem, boolean flag) {
		if (tem == null) {
			return true;
		}

		if (true == flag) {
			if (tem.trim().length() == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			if (tem.length() == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * tem?????????????????????("" or " "),??????true
	 * 
	 * @param ?????????
	 * @author Jason(3412)
	 * @date 2009-7-9
	 * @return boolean
	 */
	public static boolean IsEmpty(String tem) {
		return IsEmpty(tem, true);
	}

	/**
	 * ???????????????toString?????????,obj???null?????????????????????''
	 * 
	 * @param
	 * @author Jason(3412)
	 * @date 2009-7-10
	 * @return String
	 */
	public static String getStringValue(Object obj) {
		if (null == obj) {
			return "";
		} else {
			return obj.toString();
		}
	}

	/**
	 * ???????????????int???,?????????????????????defal
	 * 
	 * @param
	 * @author Jason(3412)
	 * @date 2009-7-10
	 * @return int
	 */
	public static int getIntegerValue(Object obj, int defal) {
		if (null == obj) {
			return defal;
		}
		try {
			return Integer.valueOf(obj.toString());
		} catch (Exception e) {
			return defal;
		}
	}

	/**
	 * ???????????????int???,?????????????????????0
	 * 
	 * @param
	 * @author Jason(3412)
	 * @date 2009-7-10
	 * @return int
	 */
	public static int getIntegerValue(Object obj) {
		return getIntegerValue(obj, 0);
	}

	/**
	 * ???????????????long???,?????????????????????defal
	 * 
	 * @param
	 * @author Jason(3412)
	 * @date 2009-7-10
	 * @return int
	 */
	public static long getLongValue(Object obj, long defal) {
		if (null == obj) {
			return defal;
		}
		try {
			return Long.valueOf(obj.toString());
		} catch (Exception e) {
			return defal;
		}
	}

	/**
	 * ???????????????long???,?????????????????????0
	 * 
	 * @param
	 * @author Jason(3412)
	 * @date 2009-7-10
	 * @return int
	 */
	public static long getLongValue(Object obj) {
		return getLongValue(obj, 0);
	}

	/**
	 * ???????????????double???,?????????????????????defal
	 * 
	 * @param
	 * @author Jason(3412)
	 * @date 2009-7-10
	 * @return int
	 */
	public static double getDoubleValue(Object obj, double defal) {
		if (null == obj) {
			return defal;
		}
		try {
			return Double.valueOf(obj.toString());
		} catch (Exception e) {
			return defal;
		}
	}

	/**
	 * ???????????????double???,?????????????????????0
	 * 
	 * @param
	 * @author Jason(3412)
	 * @date 2009-7-10
	 * @return int
	 */
	public static Double getDoubleValue(Object obj) {
		return getDoubleValue(obj, 0);
	}

	/**
	 * ???????????????
	 * 
	 * @return ?????????????????????
	 * @author shenkj
	 * @date 2006-2-7
	 */
	public static String replace(String strSource, String strFrom, String strTo) {
		java.lang.String strDest = "";
		int intFromLen = strFrom.length();
		int intPos;
		while ((intPos = strSource.indexOf(strFrom)) != -1) {
			strDest = strDest + strSource.substring(0, intPos);
			strDest = strDest + strTo;
			strSource = strSource.substring(intPos + intFromLen);
		}
		strDest = strDest + strSource;

		return strDest;
	}

	/**
	 * <code>pattern</code>
	 * 
	 * @param pattern
	 *            yyyy-MM-dd HH:mm:ss
	 * @param lms
	 *            ??? 1970 ??? 1 ??? 1 ???00:00:00 GMT ???
	 * @return<code>pattern</code>
	 */
	public static String formatDate(String pattern, long lms) {
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		Date nowc = new Date(lms * 1000L);

		return formatter.format(nowc);
	}
	
	/**
	 * ?????????????????????
	 * @param obj
	 * @return
	 */
	public static String getUpperCase(String obj)
	{
		if (null == obj)
		{
			return "";
		}
		try
		{
			return obj.toUpperCase();
		}
		catch (Exception e)
		{
			return "";
		}
	}
	
	/**
     * ??????????????????Unicode??????
     */
    public static String encode(String src) throws Exception {
        char c;
        StringBuilder str = new StringBuilder();
        int intAsc;
        String strHex;
        for (int i = 0; i < src.length(); i++) {
            c = src.charAt(i);
            intAsc = (int) c;
            strHex = Integer.toHexString(intAsc);
            if (intAsc > 128)
                str.append("\\u" + strHex);
            else
                str.append("\\u00" + strHex); // ??????????????????00
        }
        return str.toString();
    }
	
    /**
     * Unicode??????????????????
     * @param src
     * @return
     */
    public static String decode(String src) {
        int t =  src.length() / 6;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String s = src.substring(i * 6, (i + 1) * 6); // ???6?????????????????????
            // ??????????????????00??????
            String s1 = s.substring(2, 4) + "00";
            // ???????????????
            String s2 = s.substring(4);
            // ???16?????????string??????int
            int n = Integer.valueOf(s1, 16) + Integer.valueOf(s2, 16);
            // ???int???????????????
            char[] chars = Character.toChars(n);
            str.append(new String(chars));
        }
        return str.toString();
    }
}
