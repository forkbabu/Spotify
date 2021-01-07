package okio;

/* access modifiers changed from: package-private */
public final class t {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    t f;
    t g;

    t() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final t a() {
        t tVar = this.f;
        t tVar2 = tVar != this ? tVar : null;
        t tVar3 = this.g;
        tVar3.f = tVar;
        this.f.g = tVar3;
        this.f = null;
        this.g = null;
        return tVar2;
    }

    public final t b(t tVar) {
        tVar.g = this;
        tVar.f = this.f;
        this.f.g = tVar;
        this.f = tVar;
        return tVar;
    }

    /* access modifiers changed from: package-private */
    public final t c() {
        this.d = true;
        return new t(this.a, this.b, this.c, true, false);
    }

    public final void d(t tVar, int i) {
        if (tVar.e) {
            int i2 = tVar.c;
            if (i2 + i > 8192) {
                if (!tVar.d) {
                    int i3 = tVar.b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = tVar.a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        tVar.c -= tVar.b;
                        tVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, tVar.a, tVar.c, i);
            tVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    t(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
