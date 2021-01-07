package defpackage;

import com.spotify.playlist.models.o;

/* renamed from: c1a  reason: default package */
public final class c1a implements fjf<b1a> {
    private final wlf<l31> a;
    private final wlf<g62<o>> b;

    public c1a(wlf<l31> wlf, wlf<g62<o>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b1a(this.a.get(), this.b.get());
    }
}
