package defpackage;

import com.spotify.android.flags.c;
import defpackage.ne4;

/* renamed from: qe4  reason: default package */
public final class qe4 implements fjf<ne4.b> {
    private final wlf<c> a;
    private final wlf<String> b;
    private final wlf<cqe> c;
    private final wlf<String> d;
    private final wlf<Boolean> e;

    public qe4(wlf<c> wlf, wlf<String> wlf2, wlf<cqe> wlf3, wlf<String> wlf4, wlf<Boolean> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ne4.b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().booleanValue());
    }
}
