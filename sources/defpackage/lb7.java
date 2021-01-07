package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: lb7  reason: default package */
public final class lb7 implements fjf<kb7> {
    private final wlf<ere> a;
    private final wlf<c> b;

    public lb7(wlf<ere> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kb7(this.a.get(), this.b.get());
    }
}
