package defpackage;

import com.google.android.exoplayer2.upstream.o;
import okhttp3.y;

/* renamed from: p72  reason: default package */
public final class p72 implements fjf<o72> {
    private final wlf<y> a;
    private final wlf<o> b;

    public p72(wlf<y> wlf, wlf<o> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o72(this.a, this.b);
    }
}
