package defpackage;

import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.music.offlinetrials.limited.uicomponents.w;
import io.reactivex.y;

/* renamed from: e9c  reason: default package */
public final class e9c implements fjf<d9c> {
    private final wlf<UserMixDataSource> a;
    private final wlf<y> b;
    private final wlf<w> c;

    public e9c(wlf<UserMixDataSource> wlf, wlf<y> wlf2, wlf<w> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d9c(this.a.get(), this.b.get(), this.c.get());
    }
}
