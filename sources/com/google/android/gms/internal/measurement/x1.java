package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;

public final class x1 {
    private final Map<String, Map<String, String>> a;

    x1(Map<String, Map<String, String>> map) {
        this.a = map;
    }

    public final String a(Uri uri, String str, String str2) {
        Map<String, String> map;
        if (uri == null || (map = this.a.get(uri.toString())) == null) {
            return null;
        }
        if (str != null) {
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
        return map.get(str2);
    }
}
