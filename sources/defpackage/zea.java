package defpackage;

import android.media.AudioManager;
import com.spotify.libs.connect.volume.controllers.p;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: zea  reason: default package */
public final class zea implements fjf<yea> {
    private final wlf<p> a;
    private final wlf<AudioManager> b;
    private final wlf<afa> c;
    private final wlf<Player> d;

    public zea(wlf<p> wlf, wlf<AudioManager> wlf2, wlf<afa> wlf3, wlf<Player> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yea(this.a.get(), ejf.a(this.b), this.c.get(), this.d.get());
    }
}
