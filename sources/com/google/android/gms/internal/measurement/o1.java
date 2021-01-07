package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.cast.framework.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class o1 implements s1 {
    private static final Map<Uri, o1> g = new m1();
    private static final String[] h = {"key", "value"};
    private final ContentResolver a;
    private final Uri b;
    private final ContentObserver c;
    private final Object d = new Object();
    private volatile Map<String, String> e;
    private final List<t1> f = new ArrayList();

    private o1(ContentResolver contentResolver, Uri uri) {
        q1 q1Var = new q1(this);
        this.c = q1Var;
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, q1Var);
    }

    public static o1 a(ContentResolver contentResolver, Uri uri) {
        o1 o1Var;
        synchronized (o1.class) {
            Map<Uri, o1> map = g;
            o1Var = (o1) ((t1) map).get(uri);
            if (o1Var == null) {
                try {
                    o1 o1Var2 = new o1(contentResolver, uri);
                    try {
                        ((t1) map).put(uri, o1Var2);
                    } catch (SecurityException unused) {
                    }
                    o1Var = o1Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return o1Var;
    }

    static synchronized void e() {
        Map<Uri, o1> map = g;
        synchronized (o1.class) {
            for (o1 o1Var : ((m1) map).values()) {
                o1Var.a.unregisterContentObserver(o1Var.c);
            }
            ((t1) map).clear();
        }
    }

    /* JADX INFO: finally extract failed */
    public final Map<String, String> b() {
        Map<String, String> map;
        Map<String, String> map2 = this.e;
        if (map2 == null) {
            synchronized (this.d) {
                map2 = this.e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) f.j(new r1(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                    this.e = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    public final void c() {
        synchronized (this.d) {
            this.e = null;
            b2.c();
        }
        synchronized (this) {
            for (t1 t1Var : this.f) {
                t1Var.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.s1
    public final /* synthetic */ Object d(String str) {
        return b().get(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map f() {
        Map map;
        Cursor query = this.a.query(this.b, h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new m1(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }
}
