package defpackage;

import com.spotify.player.model.PlayOrigin;

/* renamed from: rd9  reason: default package */
public final class rd9 implements fjf<qd9> {
    private final wlf<faa> a;
    private final wlf<PlayOrigin> b;

    public rd9(wlf<faa> wlf, wlf<PlayOrigin> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qd9(this.a.get(), this.b.get());
    }
}
