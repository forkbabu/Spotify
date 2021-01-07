package defpackage;

import android.content.Context;
import com.spotify.music.connection.l;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.playlist.endpoints.i;

/* renamed from: lf6  reason: default package */
public final class lf6 implements fjf<kf6> {
    private final wlf<Context> a;
    private final wlf<af6> b;
    private final wlf<i> c;
    private final wlf<l> d;
    private final wlf<vb6> e;
    private final wlf<HomeMixFormatListAttributesHelper> f;

    public lf6(wlf<Context> wlf, wlf<af6> wlf2, wlf<i> wlf3, wlf<l> wlf4, wlf<vb6> wlf5, wlf<HomeMixFormatListAttributesHelper> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kf6(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
