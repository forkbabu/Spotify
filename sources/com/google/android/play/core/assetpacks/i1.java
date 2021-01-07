package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* access modifiers changed from: package-private */
public final class i1 {
    private static final a g = new a("ExtractorSessionStoreView");
    private final z a;
    private final x<f3> b;
    private final u0 c;
    private final x<Executor> d;
    private final Map<Integer, f1> e = new HashMap();
    private final ReentrantLock f = new ReentrantLock();

    i1(z zVar, x<f3> xVar, u0 u0Var, x<Executor> xVar2) {
        this.a = zVar;
        this.b = xVar;
        this.c = u0Var;
        this.d = xVar2;
    }

    private final <T> T a(h1<T> h1Var) {
        try {
            this.f.lock();
            return h1Var.e();
        } finally {
            this.f.unlock();
        }
    }

    private final f1 p(int i) {
        Map<Integer, f1> map = this.e;
        Integer valueOf = Integer.valueOf(i);
        f1 f1Var = map.get(valueOf);
        if (f1Var != null) {
            return f1Var;
        }
        throw new bv(String.format("Could not find session %d while trying to get it", valueOf), i);
    }

    private static String q(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new bv("Session without pack received.");
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f.lock();
    }

    /* access modifiers changed from: package-private */
    public final void c(int i) {
        a(new c1(this, i));
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, int i, long j) {
        a(new z0(this, str, i, j));
    }

    /* access modifiers changed from: package-private */
    public final boolean e(Bundle bundle) {
        return ((Boolean) a(new x0(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.f.unlock();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(int i) {
        p(i).c.c = 5;
    }

    /* access modifiers changed from: package-private */
    public final void h(String str, int i, long j) {
        f1 f1Var = (f1) ((Map) a(new a1(this, Arrays.asList(str)))).get(str);
        if (f1Var == null || s1.e(f1Var.c.c)) {
            g.e(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.a.v(str, i, j);
        f1Var.c.c = 4;
    }

    /* access modifiers changed from: package-private */
    public final boolean i(Bundle bundle) {
        return ((Boolean) a(new y0(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean j(Bundle bundle) {
        Boolean bool = Boolean.TRUE;
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return bool;
        }
        Map<Integer, f1> map = this.e;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return bool;
        }
        f1 f1Var = this.e.get(valueOf);
        if (f1Var.c.c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!s1.c(f1Var.c.c, bundle.getInt(rw.b("status", q(bundle)))));
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, f1> k() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map l(List list) {
        HashMap hashMap = new HashMap();
        for (f1 f1Var : this.e.values()) {
            String str = f1Var.c.a;
            if (list.contains(str)) {
                f1 f1Var2 = (f1) hashMap.get(str);
                if ((f1Var2 == null ? -1 : f1Var2.a) < f1Var.a) {
                    hashMap.put(str, f1Var);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m(int i) {
        f1 p = p(i);
        if (s1.e(p.c.c)) {
            z zVar = this.a;
            e1 e1Var = p.c;
            zVar.v(e1Var.a, p.b, e1Var.b);
            e1 e1Var2 = p.c;
            int i2 = e1Var2.c;
            if (i2 == 5 || i2 == 6) {
                this.a.o(e1Var2.a);
                return;
            }
            return;
        }
        throw new bv(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
    }

    /* access modifiers changed from: package-private */
    public final Boolean n(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, f1> map = this.e;
        Integer valueOf = Integer.valueOf(i);
        boolean z = true;
        if (map.containsKey(valueOf)) {
            f1 p = p(i);
            int i2 = bundle.getInt(rw.b("status", p.c.a));
            if (s1.c(p.c.c, i2)) {
                g.c("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(p.c.c));
                e1 e1Var = p.c;
                String str = e1Var.a;
                int i3 = e1Var.c;
                if (i3 == 4) {
                    this.b.e().a(i, str);
                } else if (i3 == 5) {
                    this.b.e().D(i);
                } else if (i3 == 6) {
                    this.b.e().A(Arrays.asList(str));
                }
            } else {
                p.c.c = i2;
                if (s1.e(i2)) {
                    a(new c1(this, i));
                    this.c.b(p.c.a);
                } else {
                    for (g1 g1Var : p.c.e) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(rw.c("chunk_intents", p.c.a, g1Var.a));
                        if (parcelableArrayList != null) {
                            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                if (!(parcelableArrayList.get(i4) == null || ((Intent) parcelableArrayList.get(i4)).getData() == null)) {
                                    g1Var.d.get(i4).a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String q = q(bundle);
            long j = bundle.getLong(rw.b("pack_version", q));
            int i5 = bundle.getInt(rw.b("status", q));
            long j2 = bundle.getLong(rw.b("total_bytes_to_download", q));
            List<String> stringArrayList = bundle.getStringArrayList(rw.b("slice_ids", q));
            ArrayList arrayList = new ArrayList();
            if (stringArrayList == null) {
                stringArrayList = Collections.emptyList();
            }
            for (String str2 : stringArrayList) {
                List<Intent> parcelableArrayList2 = bundle.getParcelableArrayList(rw.c("chunk_intents", q, str2));
                ArrayList arrayList2 = new ArrayList();
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = Collections.emptyList();
                }
                for (Intent intent : parcelableArrayList2) {
                    if (intent == null) {
                        z = false;
                    }
                    arrayList2.add(new d1(z));
                    z = true;
                }
                String string = bundle.getString(rw.c("uncompressed_hash_sha256", q, str2));
                long j3 = bundle.getLong(rw.c("uncompressed_size", q, str2));
                int i6 = bundle.getInt(rw.c("patch_format", q, str2), 0);
                arrayList.add(i6 != 0 ? new g1(str2, string, j3, arrayList2, 0, i6) : new g1(str2, string, j3, arrayList2, bundle.getInt(rw.c("compression_format", q, str2), 0), 0));
                z = true;
            }
            this.e.put(Integer.valueOf(i), new f1(i, bundle.getInt("app_version_code"), new e1(q, j, i5, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    public final void o(int i) {
        a(new b1(this, i));
    }
}
