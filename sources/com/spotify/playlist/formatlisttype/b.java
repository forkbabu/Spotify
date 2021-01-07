package com.spotify.playlist.formatlisttype;

import com.spotify.mobile.android.util.Assertion;
import java.util.HashMap;
import java.util.Map;

public final class b implements a {
    private static final FormatListType[] b = FormatListType.values();
    private final Map<String, FormatListType> a = new HashMap();

    @Override // com.spotify.playlist.formatlisttype.a
    public FormatListType a(String str) {
        if (str == null || str.length() == 0) {
            return FormatListType.r;
        }
        FormatListType formatListType = this.a.get(str);
        if (formatListType != null) {
            return formatListType;
        }
        FormatListType formatListType2 = FormatListType.r;
        FormatListType[] formatListTypeArr = b;
        for (FormatListType formatListType3 : formatListTypeArr) {
            if (formatListType3.d(str)) {
                if (formatListType2 != FormatListType.r) {
                    Assertion.g("Ambiguous patterns detected. Pattern for type " + formatListType2 + " overlaps with " + formatListType3 + ", which is not allowed.");
                }
                formatListType2 = formatListType3;
            }
        }
        this.a.put(str, formatListType2);
        return formatListType2;
    }
}
