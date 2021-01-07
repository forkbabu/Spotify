package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.l;

/* renamed from: rf6  reason: default package */
public final class rf6 implements fjf<qf6> {
    private final wlf<Context> a;
    private final wlf<l> b;
    private final wlf<HomeMixFormatListAttributesHelper> c;

    public rf6(wlf<Context> wlf, wlf<l> wlf2, wlf<HomeMixFormatListAttributesHelper> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qf6(this.a.get(), this.b.get(), this.c.get());
    }
}
