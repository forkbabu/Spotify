package defpackage;

import com.google.android.exoplayer2.util.v;
import defpackage.nn;
import java.io.EOFException;

/* renamed from: uj  reason: default package */
public final class uj {
    private final v a = new v(10);

    public um a(nj njVar, nn.a aVar) {
        um umVar = null;
        int i = 0;
        while (true) {
            try {
                njVar.f(this.a.a, 0, 10, false);
                this.a.K(0);
                if (this.a.A() != 4801587) {
                    break;
                }
                this.a.L(3);
                int w = this.a.w();
                int i2 = w + 10;
                if (umVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    njVar.f(bArr, 10, w, false);
                    umVar = new nn(aVar).c(bArr, i2);
                } else {
                    njVar.a(w, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        njVar.j();
        njVar.a(i, false);
        return umVar;
    }
}
