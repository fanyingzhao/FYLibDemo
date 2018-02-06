package fyz.log;

/**
 * Created by fyz on 2018/2/6.
 */

public class LogManager {

    /** 关闭或者打开普通日志 **/
    public static boolean DEBUG = true;

    /** 关闭或打开crash 日志写入文件 **/
    public static boolean CRASH_SAVE_FILE = true;

    /** 关闭或打开日志上传服务器 **/
    public static boolean CRASH_UPLOAD_SERVER = false;

    /** 是否加密数据 **/
    public static boolean ENCRYPT = false;



    public void d(Class clazz, String msg) {

    }

    public void d() {

    }

    private void print() {

    }
}
