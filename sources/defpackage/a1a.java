package defpackage;

import com.spotify.playlist.models.o;

/* renamed from: a1a  reason: default package */
public final class a1a implements fjf<z0a> {
    private final wlf<l31> a;
    private final wlf<g62<o>> b;

    public a1a(wlf<l31> wlf, wlf<g62<o>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z0a(this.a.get(), this.b.get());
    }
}
