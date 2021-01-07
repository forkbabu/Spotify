package defpackage;

import com.spotify.music.json.g;

/* renamed from: nb9  reason: default package */
public final class nb9 implements fjf<mb9> {
    private final wlf<ob9> a;
    private final wlf<g> b;

    public nb9(wlf<ob9> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mb9(this.a.get(), this.b.get());
    }
}
