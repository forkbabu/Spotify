package com.spotify.music.libs.mediabrowserservice;

import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.libs.mediabrowserservice.h2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class o2 {
    private final RecentlyUsedComparator a;
    private final HashMap<String, RootHintsParams> b = new HashMap<>(5);
    private final HashMap<String, h2.a> c = new HashMap<>(5);
    private final HashMap<String, n2> d;
    private final MediaSessionCompat e;
    private final Set<u1> f;
    private final s1 g;
    private WeakReference<v1> h;
    private a i;

    public interface a {
        void a(MediaSessionCompat mediaSessionCompat);

        void b();
    }

    public o2(MediaSessionCompat mediaSessionCompat, Set<u1> set, s1 s1Var, RecentlyUsedComparator recentlyUsedComparator) {
        this.e = mediaSessionCompat;
        this.f = set;
        this.g = s1Var;
        this.a = recentlyUsedComparator;
        this.d = new HashMap<>(5);
    }

    private v1 e() {
        WeakReference<v1> weakReference = this.h;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void a(String str, h2.a aVar) {
        if (e() != null) {
            String b2 = this.g.b(str);
            n2 n2Var = this.d.get(b2);
            if (n2Var == null) {
                Logger.n("No service session found for packageName: %s", b2);
            }
            if (n2Var != null) {
                aVar.b(n2Var);
            } else {
                aVar.a();
            }
        } else {
            this.c.put(str, aVar);
        }
    }

    public void b(v1 v1Var, a aVar) {
        v1Var.getClass();
        this.h = new WeakReference<>(v1Var);
        this.i = aVar;
        MediaSessionCompat mediaSessionCompat = this.e;
        v1 e2 = e();
        for (Map.Entry<String, RootHintsParams> entry : this.b.entrySet()) {
            if (!(entry == null || e2 == null)) {
                c(entry.getKey(), mediaSessionCompat, entry.getValue());
            }
        }
        this.b.clear();
        for (Map.Entry<String, h2.a> entry2 : this.c.entrySet()) {
            String key = entry2.getKey();
            h2.a value = entry2.getValue();
            if (!(key == null || e2 == null)) {
                a(key, value);
            }
        }
        this.c.clear();
    }

    public void c(String str, MediaSessionCompat mediaSessionCompat, RootHintsParams rootHintsParams) {
        v1 e2 = e();
        if (e2 != null) {
            String b2 = this.g.b(str);
            if (!(this.d.containsKey(str) || b2 == null)) {
                for (u1 u1Var : this.f) {
                    if (u1Var.d(b2)) {
                        Logger.b("Using %s to create MediaBrowserServiceSession for package %s", u1Var.getClass().getName(), b2);
                        this.d.put(b2, u1Var.a(b2, e2, rootHintsParams));
                        a aVar = this.i;
                        if (aVar != null) {
                            aVar.a(mediaSessionCompat);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.b.put(str, rootHintsParams);
    }

    public void d() {
        WeakReference<v1> weakReference = this.h;
        if (weakReference != null) {
            weakReference.clear();
            this.h = null;
        }
        this.b.clear();
        this.c.clear();
        for (Map.Entry<String, n2> entry : this.d.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().destroy();
            }
        }
        this.d.clear();
        a aVar = this.i;
        if (aVar != null) {
            aVar.b();
        }
        this.i = null;
    }

    public List<n2> f() {
        ArrayList arrayList = new ArrayList(this.d.size());
        for (n2 n2Var : this.d.values()) {
            if (n2Var.a()) {
                arrayList.add(n2Var);
            }
        }
        return arrayList;
    }

    public Set<Map.Entry<String, n2>> g() {
        return this.d.entrySet();
    }

    public n2 h() {
        n2 n2Var = null;
        if (((ArrayList) f()).isEmpty()) {
            return null;
        }
        Iterator it = ((ArrayList) f()).iterator();
        while (it.hasNext()) {
            n2 n2Var2 = (n2) it.next();
            if (n2Var2.h()) {
                if (n2Var != null) {
                    if (!(this.a.compare(n2Var, n2Var2) > 0)) {
                    }
                }
                n2Var = n2Var2;
            }
        }
        return n2Var;
    }
}
