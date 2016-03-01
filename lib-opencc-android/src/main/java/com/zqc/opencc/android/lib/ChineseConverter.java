package com.zqc.opencc.android.lib;

/**
 * Created by zhangqichuan on 29/2/16.
 */
public class ChineseConverter {

    private static ChineseConverter chineseConverter;

    public static ChineseConverter getInstance() {
        if (chineseConverter == null) {
            chineseConverter = new ChineseConverter();
        }
        return chineseConverter;
    }

    private ChineseConverter() {

    }

    public native String convert(String text, String type);

    static {
        System.loadLibrary("lib-opencc-android");
    }
}
