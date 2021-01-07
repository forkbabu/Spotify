package defpackage;

import com.spotify.http.u;

/* renamed from: gp5  reason: default package */
public final class gp5 implements fjf<qo5> {
    private final wlf<u> a;

    public gp5(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        qo5 qo5 = (qo5) this.a.get().c(qo5.class);
        yif.g(qo5, "Cannot return null from a non-@Nullable @Provides method");
        return qo5;
    }
}
