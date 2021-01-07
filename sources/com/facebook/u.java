package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public class u extends OutputStream implements w {
    private final Map<m, x> a = new HashMap();
    private final Handler b;
    private m c;
    private x f;
    private int n;

    u(Handler handler) {
        this.b = handler;
    }

    @Override // com.facebook.w
    public void a(m mVar) {
        this.c = mVar;
        this.f = mVar != null ? this.a.get(mVar) : null;
    }

    /* access modifiers changed from: package-private */
    public void b(long j) {
        if (this.f == null) {
            x xVar = new x(this.b, this.c);
            this.f = xVar;
            this.a.put(this.c, xVar);
        }
        this.f.b(j);
        this.n = (int) (((long) this.n) + j);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public Map<m, x> f() {
        return this.a;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        b((long) bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        b((long) i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        b(1);
    }
}
