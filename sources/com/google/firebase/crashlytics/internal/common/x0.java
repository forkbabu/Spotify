package com.google.firebase.crashlytics.internal.common;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class x0 {
    private String a = null;
    private final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    private static String c(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    public Map<String, String> a() {
        return Collections.unmodifiableMap(this.b);
    }

    public String b() {
        return this.a;
    }

    public void d(String str, String str2) {
        String str3;
        if (str != null) {
            String c = c(str);
            if (this.b.size() < 64 || this.b.containsKey(c)) {
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = c(str2);
                }
                this.b.put(c, str3);
                return;
            }
            ty.f().b("Exceeded maximum number of custom attributes (64)");
            return;
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public void e(String str) {
        this.a = c(str);
    }
}
