package defpackage;

import com.spotify.mobile.android.recentlyplayed.b;

/* renamed from: si5  reason: default package */
public final class si5 implements fjf<ri5> {
    private final wlf<b> a;

    public si5(wlf<b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ri5(this.a.get());
    }
}
