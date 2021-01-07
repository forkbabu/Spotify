package defpackage;

import com.spotify.mobile.android.util.t;

/* renamed from: ed0  reason: default package */
public final class ed0 implements fjf<dd0> {
    private final wlf<t> a;

    public ed0(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dd0(this.a.get());
    }
}
