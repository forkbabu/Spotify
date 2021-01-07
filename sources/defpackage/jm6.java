package defpackage;

import com.spotify.music.connection.l;
import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.music.offlinetrials.limited.logging.c;
import defpackage.ao6;
import defpackage.lh6;
import io.reactivex.y;

/* renamed from: jm6  reason: default package */
public final class jm6 implements fjf<im6> {
    private final wlf<ao6.a> a;
    private final wlf<lh6.a> b;
    private final wlf<UserMixDataSource> c;
    private final wlf<y> d;
    private final wlf<c> e;
    private final wlf<l> f;
    private final wlf<com.spotify.music.offlinetrials.limited.uicomponents.y> g;

    public jm6(wlf<ao6.a> wlf, wlf<lh6.a> wlf2, wlf<UserMixDataSource> wlf3, wlf<y> wlf4, wlf<c> wlf5, wlf<l> wlf6, wlf<com.spotify.music.offlinetrials.limited.uicomponents.y> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new im6(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
