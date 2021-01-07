package defpackage;

import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import defpackage.um;
import java.nio.ByteBuffer;

/* renamed from: wn  reason: default package */
public final class wn implements wm {
    private final v a = new v();
    private final u b = new u();
    private e0 c;

    @Override // defpackage.wm
    public um a(ym ymVar) {
        ByteBuffer byteBuffer = ymVar.b;
        byteBuffer.getClass();
        e0 e0Var = this.c;
        if (e0Var == null || ymVar.o != e0Var.e()) {
            e0 e0Var2 = new e0(ymVar.c);
            this.c = e0Var2;
            e0Var2.a(ymVar.c - ymVar.o);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.I(array, limit);
        this.b.l(array, limit);
        this.b.o(39);
        long h = (((long) this.b.h(1)) << 32) | ((long) this.b.h(32));
        this.b.o(20);
        int h2 = this.b.h(12);
        int h3 = this.b.h(8);
        um.b bVar = null;
        this.a.L(14);
        if (h3 == 0) {
            bVar = new yn();
        } else if (h3 == 255) {
            bVar = un.a(this.a, h2, h);
        } else if (h3 == 4) {
            bVar = zn.a(this.a);
        } else if (h3 == 5) {
            bVar = xn.a(this.a, h, this.c);
        } else if (h3 == 6) {
            bVar = ao.a(this.a, h, this.c);
        }
        return bVar == null ? new um(new um.b[0]) : new um(bVar);
    }
}
