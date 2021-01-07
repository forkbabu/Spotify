package defpackage;

import com.spotify.music.json.g;

/* renamed from: zl4  reason: default package */
public final class zl4 implements fjf<yl4> {
    private final wlf<g> a;

    public zl4(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yl4(this.a.get());
    }
}
