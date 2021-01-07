package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class k1 {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean e = new AtomicBoolean();
    private static HashMap<String, String> f;
    private static final HashMap<String, Boolean> g = new HashMap<>();
    private static final HashMap<String, Integer> h = new HashMap<>();
    private static final HashMap<String, Long> i = new HashMap<>();
    private static final HashMap<String, Float> j = new HashMap<>();
    private static Object k;
    private static boolean l;
    private static String[] m = new String[0];

    public static String a(ContentResolver contentResolver, String str) {
        Object obj;
        String str2;
        synchronized (k1.class) {
            if (f == null) {
                e.set(false);
                f = new HashMap<>();
                k = new Object();
                l = false;
                contentResolver.registerContentObserver(a, true, new n1());
            } else if (e.getAndSet(false)) {
                f.clear();
                g.clear();
                h.clear();
                i.clear();
                j.clear();
                k = new Object();
                l = false;
            }
            obj = k;
            str2 = null;
            if (f.containsKey(str)) {
                String str3 = f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            for (String str4 : m) {
                if (str.startsWith(str4)) {
                    if (!l || f.isEmpty()) {
                        String[] strArr = m;
                        HashMap<String, String> hashMap = f;
                        Cursor query = contentResolver.query(b, null, null, strArr, null);
                        TreeMap treeMap = new TreeMap();
                        if (query != null) {
                            while (query.moveToNext()) {
                                try {
                                    treeMap.put(query.getString(0), query.getString(1));
                                } finally {
                                    query.close();
                                }
                            }
                        }
                        hashMap.putAll(treeMap);
                        l = true;
                        if (f.containsKey(str)) {
                            String str5 = f.get(str);
                            if (str5 != null) {
                                str2 = str5;
                            }
                            return str2;
                        }
                    }
                    return null;
                }
            }
        }
        Cursor query2 = contentResolver.query(a, null, null, new String[]{str}, null);
        if (query2 == null) {
            if (query2 != null) {
                query2.close();
            }
            return null;
        }
        try {
            if (!query2.moveToFirst()) {
                c(obj, str, null);
                return null;
            }
            String string = query2.getString(1);
            if (string != null && string.equals(null)) {
                string = null;
            }
            c(obj, str, string);
            if (string != null) {
                str2 = string;
            }
            query2.close();
            return str2;
        } finally {
            query2.close();
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (k1.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }
}
