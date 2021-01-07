package com.google.zxing.common;

import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.Map;

public enum CharacterSetECI {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, Constants.ENCODING),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");
    
    private static final Map<Integer, CharacterSetECI> K = new HashMap();
    private static final Map<String, CharacterSetECI> L = new HashMap();
    private final String[] otherEncodingNames;
    private final int[] values;

    static {
        CharacterSetECI[] values2 = values();
        for (int i = 0; i < 27; i++) {
            CharacterSetECI characterSetECI = values2[i];
            for (int i2 : characterSetECI.values) {
                K.put(Integer.valueOf(i2), characterSetECI);
            }
            L.put(characterSetECI.name(), characterSetECI);
            for (String str : characterSetECI.otherEncodingNames) {
                L.put(str, characterSetECI);
            }
        }
    }

    private CharacterSetECI(int i, String... strArr) {
        this.values = new int[]{i};
        this.otherEncodingNames = strArr;
    }

    public static CharacterSetECI d(String str) {
        return L.get(str);
    }

    public int g() {
        return this.values[0];
    }

    private CharacterSetECI(int i) {
        this.values = new int[]{i};
        this.otherEncodingNames = new String[0];
    }

    private CharacterSetECI(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }
}
