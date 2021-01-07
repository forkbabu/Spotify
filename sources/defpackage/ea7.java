package defpackage;

import com.spotify.music.navigation.t;

/* renamed from: ea7  reason: default package */
public final class ea7 implements fjf<da7> {
    private final wlf<t> a;

    public ea7(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new da7(this.a.get());
    }
}
