package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.j;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import defpackage.om;

/* renamed from: am  reason: default package */
public final class am implements vl {
    private final String a;
    private final v b;
    private final u c;
    private zj d;
    private d0 e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;

    public am(String str) {
        this.a = str;
        v vVar = new v(1024);
        this.b = vVar;
        this.c = new u(vVar.a);
    }

    private static long a(u uVar) {
        return (long) uVar.h((uVar.h(2) + 1) * 8);
    }

    private int g(u uVar) {
        int b2 = uVar.b();
        Pair<Integer, Integer> c2 = j.c(uVar, true);
        this.r = ((Integer) c2.first).intValue();
        this.t = ((Integer) c2.second).intValue();
        return b2 - uVar.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0148, code lost:
        if (r23.l == false) goto L_0x01a2;
     */
    @Override // defpackage.vl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.android.exoplayer2.util.v r24) {
        /*
        // Method dump skipped, instructions count: 529
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am.b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // defpackage.vl
    public void c() {
        this.g = 0;
        this.l = false;
    }

    @Override // defpackage.vl
    public void d(rj rjVar, om.d dVar) {
        dVar.a();
        this.d = rjVar.s(dVar.c(), 1);
        this.f = dVar.b();
    }

    @Override // defpackage.vl
    public void e() {
    }

    @Override // defpackage.vl
    public void f(long j2, int i2) {
        this.k = j2;
    }
}
