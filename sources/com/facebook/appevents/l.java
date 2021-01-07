package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.internal.f0;
import com.facebook.k;
import com.spotify.music.features.ads.rules.m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class l {
    private static final String a = "l";
    private static SharedPreferences b;
    private static AtomicBoolean c = new AtomicBoolean(false);
    private static final ConcurrentHashMap<String, String> d = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>();

    static /* synthetic */ AtomicBoolean a() {
        if (uf.c(l.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            uf.b(th, l.class);
            return null;
        }
    }

    static /* synthetic */ void b() {
        if (!uf.c(l.class)) {
            try {
                f();
            } catch (Throwable th) {
                uf.b(th, l.class);
            }
        }
    }

    static /* synthetic */ SharedPreferences c() {
        if (uf.c(l.class)) {
            return null;
        }
        try {
            return b;
        } catch (Throwable th) {
            uf.b(th, l.class);
            return null;
        }
    }

    public static String d() {
        if (uf.c(l.class)) {
            return null;
        }
        try {
            if (!c.get()) {
                f();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(d);
            hashMap.putAll(e());
            return f0.H(hashMap);
        } catch (Throwable th) {
            uf.b(th, l.class);
            return null;
        }
    }

    private static Map<String, String> e() {
        if (uf.c(l.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> b2 = te.b();
            for (String str : e.keySet()) {
                if (b2.contains(str)) {
                    hashMap.put(str, e.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            uf.b(th, l.class);
            return null;
        }
    }

    private static synchronized void f() {
        synchronized (l.class) {
            if (!uf.c(l.class)) {
                try {
                    if (!c.get()) {
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(k.d());
                        b = defaultSharedPreferences;
                        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                        String string2 = b.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                        d.putAll(f0.a(string));
                        e.putAll(f0.a(string2));
                        c.set(true);
                    }
                } catch (Throwable th) {
                    uf.b(th, l.class);
                }
            }
        }
    }

    static void g() {
        if (!uf.c(l.class)) {
            try {
                if (!c.get()) {
                    f();
                }
            } catch (Throwable th) {
                uf.b(th, l.class);
            }
        }
    }

    private static String h(String str, String str2) {
        String str3;
        if (uf.c(l.class)) {
            return null;
        }
        try {
            String lowerCase = str2.trim().toLowerCase();
            if ("em".equals(str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(a, "Setting email failure: this is not a valid email address");
                return "";
            } else if ("ph".equals(str)) {
                return lowerCase.replaceAll("[^0-9]", "");
            } else {
                if (!"ge".equals(str)) {
                    return lowerCase;
                }
                if (lowerCase.length() > 0) {
                    str3 = lowerCase.substring(0, 1);
                } else {
                    str3 = "";
                }
                if ("f".equals(str3) || m.f.equals(str3)) {
                    return str3;
                }
                Log.e(a, "Setting gender failure: the supported value for gender is f or m");
                return "";
            }
        } catch (Throwable th) {
            uf.b(th, l.class);
            return null;
        }
    }

    static void i(Map<String, String> map) {
        if (!uf.c(l.class)) {
            try {
                if (!c.get()) {
                    f();
                }
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String S = f0.S(h(key, map.get(key).trim()));
                    ConcurrentHashMap<String, String> concurrentHashMap = e;
                    if (concurrentHashMap.containsKey(key)) {
                        String str = concurrentHashMap.get(key);
                        String[] split = str != null ? str.split(",") : new String[0];
                        HashSet hashSet = new HashSet(Arrays.asList(split));
                        if (!hashSet.contains(S)) {
                            StringBuilder sb = new StringBuilder();
                            if (split.length == 0) {
                                sb.append(S);
                            } else if (split.length < 5) {
                                sb.append(str);
                                sb.append(",");
                                sb.append(S);
                            } else {
                                for (int i = 1; i < 5; i++) {
                                    sb.append(split[i]);
                                    sb.append(",");
                                }
                                sb.append(S);
                                hashSet.remove(split[0]);
                            }
                            e.put(key, sb.toString());
                        } else {
                            return;
                        }
                    } else {
                        concurrentHashMap.put(key, S);
                    }
                }
                String H = f0.H(e);
                if (!uf.c(l.class)) {
                    try {
                        k.l().execute(new k("com.facebook.appevents.UserDataStore.internalUserData", H));
                    } catch (Throwable th) {
                        uf.b(th, l.class);
                    }
                }
            } catch (Throwable th2) {
                uf.b(th2, l.class);
            }
        }
    }
}
