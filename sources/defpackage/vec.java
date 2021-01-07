package defpackage;

import com.spotify.player.controls.d;

/* renamed from: vec  reason: default package */
public final class vec implements fjf<uec> {
    private final wlf<d> a;

    public vec(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uec(this.a.get());
    }
}
