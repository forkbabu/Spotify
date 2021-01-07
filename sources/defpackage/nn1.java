package defpackage;

import com.spotify.libs.connect.providers.t;
import com.spotify.music.playback.api.LocalPlaybackStatus;
import io.reactivex.s;

/* renamed from: nn1  reason: default package */
public final class nn1 implements fjf<s<LocalPlaybackStatus>> {
    private final wlf<t> a;

    public nn1(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a().j0(fn1.a).v0(1).h1();
    }
}
