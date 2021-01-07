package defpackage;

import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.q;
import defpackage.ao6;
import defpackage.lh6;

/* renamed from: de6  reason: default package */
public final class de6 implements fjf<ce6> {
    private final wlf<ao6.a> a;
    private final wlf<lh6.a> b;
    private final wlf<HomeMixFormatListAttributesHelper> c;
    private final wlf<te6> d;
    private final wlf<yn1> e;
    private final wlf<me6> f;
    private final wlf<q> g;

    public de6(wlf<ao6.a> wlf, wlf<lh6.a> wlf2, wlf<HomeMixFormatListAttributesHelper> wlf3, wlf<te6> wlf4, wlf<yn1> wlf5, wlf<me6> wlf6, wlf<q> wlf7) {
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
        return new ce6(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
