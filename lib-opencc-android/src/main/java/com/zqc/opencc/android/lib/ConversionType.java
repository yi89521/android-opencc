package com.zqc.opencc.android.lib;

/**
 * Created by zhangqichuan on 2/3/16.
 */
public enum ConversionType {
    HK2S, //hk2s.json Traditional Chinese (Hong Kong Standard) to Simplified Chinese 香港繁體（香港小學學習字詞表標準）到簡體
    S2HK, //s2hk.json Simplified Chinese to Traditional Chinese (Hong Kong Standard) 簡體到香港繁體（香港小學學習字詞表標準）
    S2T, //s2t.json Simplified Chinese to Traditional Chinese 簡體到繁體
    S2TW,//s2tw.json Simplified Chinese to Traditional Chinese (Taiwan Standard) 簡體到臺灣正體
    S2TWP, //s2twp.json Simplified Chinese to Traditional Chinese (Taiwan Standard) with Taiwanese idiom 簡體到繁體（臺灣正體標準）並轉換爲臺灣常用詞彙
    T2HK, //t2hk.json Traditional Chinese to Traditional Chinese (Hong Kong Standard) 繁體到香港繁體（香港小學學習字詞表標準）
    T2S, //t2s.json Traditional Chinese to Simplified Chinese 繁體到簡體
    T2TW,//t2tw.json Traditional Chinese to Traditional Chinese (Taiwan Standard) 繁體臺灣正體
    TW2S, //tw2s.json Traditional Chinese (Taiwan Standard) to Simplified Chinese 臺灣正體到簡體
    TW2SP; //tw2sp.json Traditional Chinese (Taiwan Standard) to Simplified Chinese with Mainland Chinese idiom 繁體（臺灣正體標準）到簡體並轉換爲中國大陸常用詞彙

    public String getValue() {
        if (this == HK2S) {
            return "hk2s.json";
        } else if (this == S2HK) {
            return "s2hk.json";
        } else if (this == S2T) {
            return "s2t.json";
        } else if (this == S2TW) {
            return "s2tw.json";
        } else if (this == S2TWP) {
            return "s2twp.json";
        } else if (this == T2HK) {
            return "t2hk.json";
        } else if (this == T2S) {
            return "t2s.json";
        } else if (this == T2TW) {
            return "t2tw.json";
        } else if (this == TW2S) {
            return "tw2s.json";
        } else if (this == TW2SP) {
            return "tw2sp.json";
        }
        return "s2t.json";
    }
}
