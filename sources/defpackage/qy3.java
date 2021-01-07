package defpackage;

import com.spotify.music.connection.l;

/* renamed from: qy3  reason: default package */
public final class qy3 implements fjf<py3> {
    private final wlf<l> a;
    private final wlf<k91> b;

    public qy3(wlf<l> wlf, wlf<k91> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new py3(this.a.get(), this.b.get());
    }
}
