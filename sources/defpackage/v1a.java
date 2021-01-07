package defpackage;

import com.spotify.music.libs.assistedcuration.presenter.q;
import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.i;

/* renamed from: v1a  reason: default package */
public final class v1a implements fjf<u1a> {
    private final wlf<c> a;
    private final wlf<String> b;
    private final wlf<d> c;
    private final wlf<i> d;
    private final wlf<q> e;

    public v1a(wlf<c> wlf, wlf<String> wlf2, wlf<d> wlf3, wlf<i> wlf4, wlf<q> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u1a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
