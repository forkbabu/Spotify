package defpackage;

import com.spotify.login.o0;
import com.spotify.music.preloadlogger.b;

/* renamed from: pwc  reason: default package */
public final class pwc implements fjf<o0> {
    private final wlf<b> a;

    public pwc(wlf<b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new owc(this.a.get());
    }
}
