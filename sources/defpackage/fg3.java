package defpackage;

import com.spotify.mobile.android.util.t;

/* renamed from: fg3  reason: default package */
public final class fg3 implements fjf<mg3> {
    private final wlf<t> a;

    public fg3(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mg3(this.a.get().a());
    }
}
