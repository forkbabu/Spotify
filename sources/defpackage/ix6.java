package defpackage;

import com.spotify.music.playlist.permissions.z;

/* renamed from: ix6  reason: default package */
public final class ix6 implements fjf<hx6> {
    private final wlf<wt6> a;
    private final wlf<z> b;

    public ix6(wlf<wt6> wlf, wlf<z> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hx6(this.a.get(), this.b.get());
    }
}
