package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

final class t0 extends OutputStream {
    private final u1 a = new u1();
    private final File b;
    private final i2 c;
    private long f;
    private long n;
    private FileOutputStream o;
    private o2 p;

    t0(File file, i2 i2Var) {
        this.b = file;
        this.c = i2Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        while (i2 > 0) {
            if (this.f == 0 && this.n == 0) {
                int b2 = this.a.b(bArr, i, i2);
                if (b2 != -1) {
                    i += b2;
                    i2 -= b2;
                    o2 c2 = this.a.c();
                    this.p = c2;
                    if (c2.g()) {
                        this.f = 0;
                        this.c.k(this.p.h(), this.p.h().length);
                        this.n = (long) this.p.h().length;
                    } else if (!this.p.b() || this.p.a()) {
                        byte[] h = this.p.h();
                        this.c.k(h, h.length);
                        this.f = this.p.d();
                    } else {
                        this.c.f(this.p.h());
                        File file = new File(this.b, this.p.c());
                        file.getParentFile().mkdirs();
                        this.f = this.p.d();
                        this.o = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.p.a()) {
                if (this.p.g()) {
                    this.c.c(this.n, bArr, i, i2);
                    this.n += (long) i2;
                    i3 = i2;
                } else if (this.p.b()) {
                    i3 = (int) Math.min((long) i2, this.f);
                    this.o.write(bArr, i, i3);
                    long j = this.f - ((long) i3);
                    this.f = j;
                    if (j == 0) {
                        this.o.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.f);
                    int length = this.p.h().length;
                    this.c.c((((long) length) + this.p.d()) - this.f, bArr, i, i3);
                    this.f -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
