package defpackage;

import com.google.protobuf.u;
import java.util.Set;

/* renamed from: are  reason: default package */
public final class are implements fjf<ere> {
    private final wlf<gl0<u>> a;
    private final wlf<Set<xqe>> b;
    private final wlf<bre> c;
    private final wlf<yqe> d;

    public are(wlf<gl0<u>> wlf, wlf<Set<xqe>> wlf2, wlf<bre> wlf3, wlf<yqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static ere a(gl0<u> gl0, Set<xqe> set, bre bre, yqe yqe) {
        return new wqe(gl0, set, bre, yqe);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wqe(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
