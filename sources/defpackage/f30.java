package defpackage;

import com.google.zxing.common.a;

/* access modifiers changed from: package-private */
/* renamed from: f30  reason: default package */
public final class f30 extends h30 {
    private final short c;
    private final short d;

    f30(h30 h30, int i, int i2) {
        super(h30);
        this.c = (short) i;
        this.d = (short) i2;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.h30
    public void a(a aVar, byte[] bArr) {
        aVar.d(this.c, this.d);
    }

    public String toString() {
        short s = this.c;
        short s2 = this.d;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(i | (1 << this.d)).substring(1) + '>';
    }
}
