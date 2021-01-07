package defpackage;

import com.spotify.music.playlist.ui.l0;
import com.spotify.music.podcastentityrow.b0;

/* renamed from: w06  reason: default package */
public final class w06 implements fjf<v06> {
    private final wlf<l0.a<t06>> a;
    private final wlf<b0> b;

    public w06(wlf<l0.a<t06>> wlf, wlf<b0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v06(this.a, this.b);
    }
}
