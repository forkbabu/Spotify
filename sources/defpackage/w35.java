package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.followfeed.persistence.g;
import com.spotify.music.features.followfeed.persistence.m;
import kotlin.jvm.internal.h;

/* renamed from: w35  reason: default package */
public final class w35 implements fjf<m> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<cqe> b;
    private final wlf<Integer> c;

    public w35(wlf<SpSharedPreferences<Object>> wlf, wlf<cqe> wlf2, wlf<Integer> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences<Object> spSharedPreferences = this.a.get();
        cqe cqe = this.b.get();
        int intValue = this.c.get().intValue();
        h.e(spSharedPreferences, "sharedPreferences");
        h.e(cqe, "clock");
        return new g(spSharedPreferences, cqe, intValue);
    }
}
