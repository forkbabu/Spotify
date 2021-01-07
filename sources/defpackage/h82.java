package defpackage;

import com.google.protobuf.u;
import com.spotify.mobile.android.util.connectivity.y;
import java.util.Arrays;

/* renamed from: h82  reason: default package */
public final class h82 implements fjf<r82> {
    private final wlf<gl0<u>> a;
    private final wlf<cqe> b;
    private final wlf<y> c;

    public h82(wlf<gl0<u>> wlf, wlf<cqe> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        gl0<u> gl0 = this.a.get();
        return new r82(Arrays.asList(w72.a, new u72(gl0), new v72(gl0, this.c.get())), this.b.get());
    }
}
