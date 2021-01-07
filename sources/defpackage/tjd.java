package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: tjd  reason: default package */
public final class tjd implements fjf<sjd> {
    private final wlf<rjd> a;
    private final wlf<SpSharedPreferences<Object>> b;
    private final wlf<cqe> c;

    public tjd(wlf<rjd> wlf, wlf<SpSharedPreferences<Object>> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sjd(this.a.get(), this.b.get(), this.c.get());
    }
}
