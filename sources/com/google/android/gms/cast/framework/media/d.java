package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.cast.o0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

public class d {
    private final com.google.android.gms.cast.internal.b a = new com.google.android.gms.cast.internal.b("MediaQueue");
    long b;
    private final h c;
    List<Integer> d;
    final SparseIntArray e;
    LruCache<Integer, m> f;
    final List<Integer> g;
    private final Deque<Integer> h;
    private final Handler i;
    private TimerTask j;
    private e<h.c> k;
    private e<h.c> l;
    private Set<a> m = new HashSet();

    public static abstract class a {
    }

    public class b extends h.a {
        public b() {
        }

        @Override // com.google.android.gms.cast.framework.media.h.a
        public final void a() {
            long k = d.this.k();
            d dVar = d.this;
            if (k != dVar.b) {
                dVar.b = k;
                dVar.a();
                d dVar2 = d.this;
                if (dVar2.b != 0) {
                    dVar2.b();
                }
            }
        }

        @Override // com.google.android.gms.cast.framework.media.h.a
        public final void b(int[] iArr) {
            List<Integer> g = com.google.android.gms.cast.internal.a.g(iArr);
            if (!d.this.d.equals(g)) {
                d.this.l();
                d.this.f.evictAll();
                d.this.g.clear();
                d dVar = d.this;
                dVar.d = g;
                d.j(dVar);
                d.this.n();
                d.this.m();
            }
        }

        @Override // com.google.android.gms.cast.framework.media.h.a
        public final void c(int[] iArr, int i) {
            int i2;
            int length = iArr.length;
            if (i == 0) {
                i2 = d.this.d.size();
            } else {
                i2 = d.this.e.get(i, -1);
                if (i2 == -1) {
                    d.this.b();
                    return;
                }
            }
            d.this.l();
            d.this.d.addAll(i2, com.google.android.gms.cast.internal.a.g(iArr));
            d.j(d.this);
            d.d(d.this, i2, length);
            d.this.m();
        }

        @Override // com.google.android.gms.cast.framework.media.h.a
        public final void d(m[] mVarArr) {
            HashSet hashSet = new HashSet();
            d.this.g.clear();
            for (m mVar : mVarArr) {
                int Q1 = mVar.Q1();
                d.this.f.put(Integer.valueOf(Q1), mVar);
                int i = d.this.e.get(Q1, -1);
                if (i == -1) {
                    d.this.b();
                    return;
                } else {
                    hashSet.add(Integer.valueOf(i));
                }
            }
            for (Integer num : d.this.g) {
                int i2 = d.this.e.get(num.intValue(), -1);
                if (i2 != -1) {
                    hashSet.add(Integer.valueOf(i2));
                }
            }
            d.this.g.clear();
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList);
            d.this.l();
            d.e(d.this, com.google.android.gms.cast.internal.a.e(arrayList));
            d.this.m();
        }

        @Override // com.google.android.gms.cast.framework.media.h.a
        public final void e(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                d.this.f.remove(Integer.valueOf(i));
                int i2 = d.this.e.get(i, -1);
                if (i2 == -1) {
                    d.this.b();
                    return;
                } else {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            Collections.sort(arrayList);
            d.this.l();
            d.e(d.this, com.google.android.gms.cast.internal.a.e(arrayList));
            d.this.m();
        }

        @Override // com.google.android.gms.cast.framework.media.h.a
        public final void f(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                d.this.f.remove(Integer.valueOf(i));
                int i2 = d.this.e.get(i, -1);
                if (i2 == -1) {
                    d.this.b();
                    return;
                }
                d.this.e.delete(i);
                arrayList.add(Integer.valueOf(i2));
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                d.this.l();
                d.this.d.removeAll(com.google.android.gms.cast.internal.a.g(iArr));
                d.j(d.this);
                d.h(d.this, com.google.android.gms.cast.internal.a.e(arrayList));
                d.this.m();
            }
        }
    }

    d(h hVar) {
        this.c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.i = new o0(Looper.getMainLooper());
        this.j = new k0(this);
        b bVar = new b();
        g.g("Must be called from the main thread.");
        hVar.h.add(bVar);
        this.f = new m0(this, 20);
        this.b = k();
        b();
    }

    static void c(d dVar) {
        if (!dVar.h.isEmpty() && dVar.k == null && dVar.b != 0) {
            e<h.c> R = dVar.c.R(com.google.android.gms.cast.internal.a.e(dVar.h));
            dVar.k = R;
            R.e(new l0(dVar));
            dVar.h.clear();
        }
    }

    static void d(d dVar, int i2, int i3) {
        for (a aVar : dVar.m) {
            aVar.getClass();
        }
    }

    static void e(d dVar, int[] iArr) {
        for (a aVar : dVar.m) {
            aVar.getClass();
        }
    }

    static void h(d dVar, int[] iArr) {
        for (a aVar : dVar.m) {
            aVar.getClass();
        }
    }

    static void j(d dVar) {
        dVar.e.clear();
        for (int i2 = 0; i2 < dVar.d.size(); i2++) {
            dVar.e.put(dVar.d.get(i2).intValue(), i2);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final long k() {
        o i2 = this.c.i();
        if (i2 == null || i2.F2()) {
            return 0;
        }
        return i2.E2();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void l() {
        for (a aVar : this.m) {
            aVar.getClass();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void m() {
        for (a aVar : this.m) {
            aVar.getClass();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void n() {
        for (a aVar : this.m) {
            aVar.getClass();
        }
    }

    public final void a() {
        l();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        this.i.removeCallbacks(this.j);
        this.h.clear();
        e<h.c> eVar = this.l;
        if (eVar != null) {
            eVar.d();
            this.l = null;
        }
        e<h.c> eVar2 = this.k;
        if (eVar2 != null) {
            eVar2.d();
            this.k = null;
        }
        n();
        m();
    }

    public final void b() {
        e<h.c> eVar;
        g.g("Must be called from the main thread.");
        if (this.b != 0 && (eVar = this.l) == null) {
            if (eVar != null) {
                eVar.d();
                this.l = null;
            }
            e<h.c> eVar2 = this.k;
            if (eVar2 != null) {
                eVar2.d();
                this.k = null;
            }
            e<h.c> L = this.c.L();
            this.l = L;
            L.e(new j0(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(h.c cVar) {
        Status h2 = cVar.h();
        int Q1 = h2.Q1();
        if (Q1 != 0) {
            this.a.f(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(Q1), h2.o2()), new Object[0]);
        }
        this.k = null;
        if (!this.h.isEmpty()) {
            this.i.removeCallbacks(this.j);
            this.i.postDelayed(this.j, 500);
        }
    }

    /* access modifiers changed from: package-private */
    public final void i(h.c cVar) {
        Status h2 = cVar.h();
        int Q1 = h2.Q1();
        if (Q1 != 0) {
            this.a.f(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(Q1), h2.o2()), new Object[0]);
        }
        this.l = null;
        if (!this.h.isEmpty()) {
            this.i.removeCallbacks(this.j);
            this.i.postDelayed(this.j, 500);
        }
    }
}
