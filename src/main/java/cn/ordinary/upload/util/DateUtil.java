package cn.ordinary.upload.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ordinary
 * @date 2019/12/24
 */
public class DateUtil {

    public static String convertNowDateString() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }
}
