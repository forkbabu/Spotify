package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.util.f0;
import java.io.IOException;

/* renamed from: ro  reason: default package */
public final class ro extends eo {
    private final int n;
    private final d0 o;
    private long p;
    private boolean q;

    public ro(k kVar, m mVar, d0 d0Var, int i, Object obj, long j, long j2, long j3, int i2, d0 d0Var2) {
        super(kVar, mVar, d0Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.n = i2;
        this.o = d0Var2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() {
        try {
            long a = this.h.a(this.a.d(this.p));
            if (a != -1) {
                a += this.p;
            }
            nj njVar = new nj(this.h, this.p, a);
            go i = i();
            i.b(0);
            zj c = i.c(0, this.n);
            c.c(this.o);
            for (int i2 = 0; i2 != -1; i2 = c.a(njVar, Integer.MAX_VALUE, true)) {
                this.p += (long) i2;
            }
            c.d(this.f, 1, (int) this.p, 0, null);
            y yVar = this.h;
            int i3 = f0.a;
            if (yVar != null) {
                try {
                    yVar.close();
                } catch (IOException unused) {
                }
            }
            this.q = true;
        } catch (Throwable th) {
            y yVar2 = this.h;
            int i4 = f0.a;
            if (yVar2 != null) {
                try {
                    yVar2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void b() {
    }

    @Override // defpackage.po
    public boolean g() {
        return this.q;
    }
}
