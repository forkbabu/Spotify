package defpackage;

import com.google.android.exoplayer2.util.g;
import defpackage.zj;

/* renamed from: yk  reason: default package */
public final class yk {
    public final boolean a;
    public final String b;
    public final zj.a c;
    public final int d;
    public final byte[] e;

    public yk(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = false;
        int i4 = 1;
        g.a((bArr2 == null ? true : z2) ^ (i == 0));
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null && (str.equals("cbc1") || str.equals("cbcs"))) {
            i4 = 2;
        }
        this.c = new zj.a(i4, bArr, i2, i3);
    }
}
