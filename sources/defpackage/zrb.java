package defpackage;

import com.spotify.nowplaying.ui.components.overlay.j;
import io.reactivex.g;

/* renamed from: zrb  reason: default package */
public final class zrb implements fjf<wrb> {
    private final wlf<g<j>> a;
    private final wlf<g<String>> b;
    private final wlf<esb> c;

    public zrb(wlf<g<j>> wlf, wlf<g<String>> wlf2, wlf<esb> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wrb(this.a.get(), this.b.get(), this.c);
    }
}
