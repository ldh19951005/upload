package cn.ordinary.upload.util;

import java.io.File;
import java.util.Calendar;

/**
 * @author ordinary
 * @date 2019/12/24
 */
public class FolderUtil {

    /**
     * 按照年月日的方式生成存储文件夹
     *
     * @param resourcePath 根目录
     * @return 文件夹绝对路径
     */
    public static String getSaveFolder(String resourcePath) {
        Calendar calendar = Calendar.getInstance();
        //获取月份加1  月份从0开始的
        String folder = String.format("%s\\%d\\%d\\%d\\", resourcePath, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
        File file = new File(folder);
        //如果文件夹不存在，先生成
        if (!file.exists()) {
            file.mkdirs();
        }
        return folder;
    }
}
