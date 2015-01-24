package com.nuoyu.utopia.utopiasso.common.utils.time;

import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liuxin3 on 2015/1/24.
 * 日期工具类  提供常用的日期工具  格式转换
 */
public class DataUtil {

    private static final Logger log = LoggerFactory.getLogger(DataUtil.class);

    /**
     * 将日期字符串转化为日期。失败返回null。
     * @param date 日期字符串
     * @param dateStyle 日期风格
     * @return 日期
     */
    public static Date StringToDate(String date, DateStyle dateStyle) {
        Date mDate = null;
        try{
            mDate = DateUtils.parseDate(date,new String[]{dateStyle.getValue()});
        }catch(Exception e){
            log.error("date Format exception(StringToDate)====>date:"+date+"==>dateStyle:"+dateStyle.getValue());
        }
        return mDate;
    }

    /**
     * 将日期转化为日期字符串。失败返回null。
     * @param date 日期
     * @param dateStyle 日期风格
     * @return 日期字符串
     */
    public static String DateToString(Date date, DateStyle dateStyle) {
        String dateString = null;
        try{
            dateString = new SimpleDateFormat(dateStyle.getValue()).format(date);
        }catch(Exception e){
            log.error("date Format exception(DateToString)====>date:"+date+"==>dateStyle:"+dateStyle.getValue());
        }
        return dateString;
    }

    // 获得星期  年 月  日
}
