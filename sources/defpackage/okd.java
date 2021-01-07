package defpackage;

import com.spotify.music.json.g;

/* renamed from: okd  reason: default package */
public final class okd implements fjf<nkd> {
    private final wlf<dre> a;
    private final wlf<g> b;

    public okd(wlf<dre> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nkd(this.a.get(), this.b.get());
    }
}
