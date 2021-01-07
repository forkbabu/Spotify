package defpackage;

import com.spotify.libs.connect.providers.t;
import com.spotify.music.playback.api.RemotePlaybackStatus;
import io.reactivex.s;

/* renamed from: on1  reason: default package */
public final class on1 implements fjf<s<RemotePlaybackStatus>> {
    private final wlf<t> a;

    public on1(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b().j0(mm1.a).v0(1).h1();
    }
}
