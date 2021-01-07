package defpackage;

import defpackage.iz;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: jz  reason: default package */
public class jz implements iz.d {
    final /* synthetic */ byte[] a;
    final /* synthetic */ int[] b;

    jz(kz kzVar, byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }

    @Override // defpackage.iz.d
    public void a(InputStream inputStream, int i) {
        try {
            inputStream.read(this.a, this.b[0], i);
            int[] iArr = this.b;
            iArr[0] = iArr[0] + i;
        } finally {
            inputStream.close();
        }
    }
}
