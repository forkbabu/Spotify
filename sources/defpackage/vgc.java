package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcastentityrow.j;
import com.spotify.music.podcastentityrow.n;
import com.spotify.music.podcastentityrow.playback.b;

/* renamed from: vgc  reason: default package */
public final class vgc implements fjf<ugc> {
    private final wlf<c> a;
    private final wlf<j> b;
    private final wlf<b> c;
    private final wlf<n> d;
    private final wlf<atc> e;

    public vgc(wlf<c> wlf, wlf<j> wlf2, wlf<b> wlf3, wlf<n> wlf4, wlf<atc> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ugc(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
