package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.q;

/* renamed from: nf6  reason: default package */
public final class nf6 implements fjf<mf6> {
    private final wlf<Context> a;
    private final wlf<q> b;
    private final wlf<HomeMixFormatListAttributesHelper> c;

    public nf6(wlf<Context> wlf, wlf<q> wlf2, wlf<HomeMixFormatListAttributesHelper> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mf6(this.a.get(), this.b.get(), this.c.get());
    }
}
