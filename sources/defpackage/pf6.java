package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.l;

/* renamed from: pf6  reason: default package */
public final class pf6 implements fjf<of6> {
    private final wlf<Context> a;
    private final wlf<l> b;
    private final wlf<HomeMixFormatListAttributesHelper> c;

    public pf6(wlf<Context> wlf, wlf<l> wlf2, wlf<HomeMixFormatListAttributesHelper> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new of6(this.a.get(), this.b.get(), this.c.get());
    }
}
