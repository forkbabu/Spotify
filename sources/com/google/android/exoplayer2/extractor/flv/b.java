package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.util.v;
import defpackage.xj;

public final class b implements qj {
    private final v a = new v(4);
    private final v b = new v(9);
    private final v c = new v(11);
    private final v d = new v();
    private final c e = new c();
    private rj f;
    private int g = 1;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private a o;
    private d p;

    private void e() {
        if (!this.n) {
            this.f.j(new xj.b(-9223372036854775807L, 0));
            this.n = true;
        }
    }

    private v g(nj njVar) {
        int i2 = this.l;
        v vVar = this.d;
        byte[] bArr = vVar.a;
        if (i2 > bArr.length) {
            vVar.I(new byte[Math.max(bArr.length * 2, i2)], 0);
        } else {
            vVar.K(0);
        }
        this.d.J(this.l);
        njVar.i(this.d.a, 0, this.l, false);
        return this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00af A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0004 A[SYNTHETIC] */
    @Override // defpackage.qj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(defpackage.nj r17, defpackage.wj r18) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flv.b.a(nj, wj):int");
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.f = rjVar;
    }

    @Override // defpackage.qj
    public void c(long j2, long j3) {
        this.g = 1;
        this.h = false;
        this.j = 0;
    }

    @Override // defpackage.qj
    public void d() {
    }

    @Override // defpackage.qj
    public boolean f(nj njVar) {
        njVar.f(this.a.a, 0, 3, false);
        this.a.K(0);
        if (this.a.A() != 4607062) {
            return false;
        }
        njVar.f(this.a.a, 0, 2, false);
        this.a.K(0);
        if ((this.a.D() & 250) != 0) {
            return false;
        }
        njVar.f(this.a.a, 0, 4, false);
        this.a.K(0);
        int h2 = this.a.h();
        njVar.j();
        njVar.a(h2, false);
        njVar.f(this.a.a, 0, 4, false);
        this.a.K(0);
        if (this.a.h() == 0) {
            return true;
        }
        return false;
    }
}
