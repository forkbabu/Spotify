package defpackage;

import com.spotify.http.w;

/* renamed from: yu1  reason: default package */
public final class yu1 implements fjf<xu1> {
    private final wlf<w> a;

    public yu1(wlf<w> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xu1(this.a.get());
    }
}
