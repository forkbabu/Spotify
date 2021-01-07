package defpackage;

import com.spotify.music.features.playlistentity.header.o0;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import io.reactivex.y;

/* renamed from: bd6  reason: default package */
public final class bd6 implements fjf<ad6> {
    private final wlf<o0> a;
    private final wlf<String> b;
    private final wlf<HomeMixFormatListAttributesHelper> c;
    private final wlf<me6> d;
    private final wlf<y> e;

    public bd6(wlf<o0> wlf, wlf<String> wlf2, wlf<HomeMixFormatListAttributesHelper> wlf3, wlf<me6> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ad6(this.a, this.b, this.c, this.d, this.e);
    }
}
