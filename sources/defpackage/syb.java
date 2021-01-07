package defpackage;

import com.spotify.remoteconfig.y8;

/* renamed from: syb  reason: default package */
public final class syb implements fjf<ryb> {
    private final wlf<Boolean> a;
    private final wlf<szb> b;
    private final wlf<y8> c;

    public syb(wlf<Boolean> wlf, wlf<szb> wlf2, wlf<y8> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ryb(this.a.get().booleanValue(), this.b.get(), this.c.get());
    }
}
