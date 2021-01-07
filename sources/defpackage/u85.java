package defpackage;

import com.spotify.mobile.android.hubframework.defaults.playback.PlayFromContextCommandHandler;
import com.spotify.music.inappmessaging.b;
import com.spotify.remoteconfig.x5;

/* renamed from: u85  reason: default package */
public final class u85 implements fjf<t85> {
    private final wlf<b> a;
    private final wlf<PlayFromContextCommandHandler> b;
    private final wlf<x5> c;

    public u85(wlf<b> wlf, wlf<PlayFromContextCommandHandler> wlf2, wlf<x5> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t85(this.a.get(), this.b.get(), this.c.get());
    }
}
