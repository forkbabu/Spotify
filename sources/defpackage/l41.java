package defpackage;

import com.spotify.mobile.android.recentlyplayed.a;

/* renamed from: l41  reason: default package */
public final class l41 implements fjf<a> {
    private final wlf<fb1> a;

    public l41(wlf<fb1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), 10, true, true, true, true, false, true, false, true);
    }
}
