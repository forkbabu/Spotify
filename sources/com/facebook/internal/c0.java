package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class c0 {
    private static final ConcurrentHashMap<String, JSONObject> a = new ConcurrentHashMap<>();

    public static JSONObject a(String str) {
        return a.get(str);
    }

    public static void b(String str, JSONObject jSONObject) {
        a.put(str, jSONObject);
    }
}
