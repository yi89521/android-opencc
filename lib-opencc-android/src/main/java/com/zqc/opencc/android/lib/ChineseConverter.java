package com.zqc.opencc.android.lib;

import android.content.res.AssetManager;

/**
 * Created by zhangqichuan on 29/2/16.
 */
public class ChineseConverter {

    public static String convert(String text, ConversionType conversionType, AssetManager assetManager){
        return convert(text, conversionType.getValue(), assetManager);
    }

    private static native String convert(String text, String type, AssetManager assetManager);

    static {
        System.loadLibrary("lib-opencc-android");
    }
}
