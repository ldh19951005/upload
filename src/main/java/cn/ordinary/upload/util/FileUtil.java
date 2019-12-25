package cn.ordinary.upload.util;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ordinary
 * @date 2019/12/24
 */
public class FileUtil {

    /**
     * 字节流写入文件
     *
     * @param filePath 文件路径
     * @param data     数据
     * @throws IOException io异常
     */
    public static void writeFile(String filePath, byte[] data) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        fileOutputStream.write(data);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
