package com.facebook;

import android.os.Handler;
import com.facebook.p;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* access modifiers changed from: package-private */
public class v extends FilterOutputStream implements w {
    private final Map<m, x> a;
    private final p b;
    private final long c = k.r();
    private long f;
    private long n;
    private long o;
    private x p;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        final /* synthetic */ p.b a;

        a(p.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    this.a.b(v.this.b, v.this.f, v.this.o);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    v(OutputStream outputStream, p pVar, Map<m, x> map, long j) {
        super(outputStream);
        this.b = pVar;
        this.a = map;
        this.o = j;
    }

    private void g(long j) {
        x xVar = this.p;
        if (xVar != null) {
            xVar.a(j);
        }
        long j2 = this.f + j;
        this.f = j2;
        if (j2 >= this.n + this.c || j2 >= this.o) {
            h();
        }
    }

    private void h() {
        if (this.f > this.n) {
            for (p.a aVar : this.b.i()) {
                if (aVar instanceof p.b) {
                    Handler h = this.b.h();
                    p.b bVar = (p.b) aVar;
                    if (h == null) {
                        bVar.b(this.b, this.f, this.o);
                    } else {
                        h.post(new a(bVar));
                    }
                }
            }
            this.n = this.f;
        }
    }

    @Override // com.facebook.w
    public void a(m mVar) {
        this.p = mVar != null ? this.a.get(mVar) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        for (x xVar : this.a.values()) {
            xVar.c();
        }
        h();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        ((FilterOutputStream) this).out.write(bArr);
        g((long) bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        g((long) i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        g(1);
    }
}
