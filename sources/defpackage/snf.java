package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okio.e;
import okio.f;
import okio.g;
import okio.w;
import okio.x;

/* renamed from: snf  reason: default package */
class snf implements w {
    boolean a;
    final /* synthetic */ g b;
    final /* synthetic */ unf c;
    final /* synthetic */ f f;

    snf(tnf tnf, g gVar, unf unf, f fVar) {
        this.b = gVar;
        this.c = unf;
        this.f = fVar;
    }

    @Override // okio.w
    public long c2(e eVar, long j) {
        try {
            long c2 = this.b.c2(eVar, j);
            if (c2 == -1) {
                if (!this.a) {
                    this.a = true;
                    this.f.close();
                }
                return -1;
            }
            eVar.f(this.f.c(), eVar.size() - c2, c2);
            this.f.S();
            return c2;
        } catch (IOException e) {
            if (!this.a) {
                this.a = true;
                this.c.abort();
            }
            throw e;
        }
    }

    @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.a && !rnf.m(this, 100, TimeUnit.MILLISECONDS)) {
            this.a = true;
            this.c.abort();
        }
        this.b.close();
    }

    @Override // okio.w
    public x k() {
        return this.b.k();
    }
}
