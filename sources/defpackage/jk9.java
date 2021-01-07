package defpackage;

import com.spotify.libs.glue.custom.playbutton.c;

/* renamed from: jk9  reason: default package */
public final class jk9 implements fjf<ik9> {
    private final wlf<c.a> a;
    private final wlf<zec> b;

    public jk9(wlf<c.a> wlf, wlf<zec> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ik9(this.a.get(), this.b.get());
    }
}
