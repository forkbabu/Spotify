package defpackage;

import com.spotify.music.json.g;
import io.reactivex.y;

/* renamed from: i81  reason: default package */
public final class i81 implements fjf<h81> {
    private final wlf<g> a;
    private final wlf<y> b;

    public i81(wlf<g> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h81(this.a.get(), this.b.get());
    }
}
