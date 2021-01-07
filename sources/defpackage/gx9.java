package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.internal.parnerid.PartnerUserIdEndpoint;
import io.reactivex.y;

/* renamed from: gx9  reason: default package */
public final class gx9 implements fjf<fx9> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<PartnerUserIdEndpoint> b;
    private final wlf<y> c;

    public gx9(wlf<SpSharedPreferences<Object>> wlf, wlf<PartnerUserIdEndpoint> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fx9(this.a.get(), this.b.get(), this.c.get());
    }
}
