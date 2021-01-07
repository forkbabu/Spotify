package defpackage;

import com.spotify.mobile.android.service.media.w2;
import com.spotify.music.playback.api.e;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: zha  reason: default package */
public final class zha implements fjf<yha> {
    private final wlf<pc1> a;
    private final wlf<w2> b;
    private final wlf<g<PlayerState>> c;
    private final wlf<e> d;
    private final wlf<pea> e;

    public zha(wlf<pc1> wlf, wlf<w2> wlf2, wlf<g<PlayerState>> wlf3, wlf<e> wlf4, wlf<pea> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yha(this.a, this.b, this.c, this.d, this.e);
    }
}
