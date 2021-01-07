package defpackage;

import com.spotify.music.features.ads.audioplus.overlay.c;
import com.spotify.music.features.ads.audioplus.overlay.g;
import com.squareup.picasso.Picasso;

/* renamed from: xm3  reason: default package */
public final class xm3 implements fjf<vm3> {
    private final wlf<Picasso> a;
    private final wlf<g> b;
    private final wlf<c> c;
    private final wlf<nu3> d;

    public xm3(wlf<Picasso> wlf, wlf<g> wlf2, wlf<c> wlf3, wlf<nu3> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        vm3 vm3 = new vm3();
        vm3.w = this.a.get();
        vm3.x = this.b.get();
        vm3.y = this.c.get();
        vm3.z = this.d.get();
        return vm3;
    }
}
