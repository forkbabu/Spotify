package defpackage;

import com.spotify.music.features.ads.audioplus.overlay.c;
import com.spotify.music.features.ads.audioplus.overlay.g;
import com.squareup.picasso.Picasso;

/* renamed from: en3  reason: default package */
public final class en3 implements fjf<cn3> {
    private final wlf<Picasso> a;
    private final wlf<c> b;
    private final wlf<nu3> c;
    private final wlf<g> d;

    public en3(wlf<Picasso> wlf, wlf<c> wlf2, wlf<nu3> wlf3, wlf<g> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        cn3 cn3 = new cn3();
        cn3.w = this.a.get();
        cn3.x = this.b.get();
        cn3.y = this.c.get();
        cn3.z = this.d.get();
        return cn3;
    }
}
