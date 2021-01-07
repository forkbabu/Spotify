package defpackage;

import com.spotify.mobile.android.hubframework.defaults.playback.ExplicitPlaybackCommandHelper;
import com.spotify.music.libs.restrictedcontent.transformer.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.play.f;
import com.spotify.rxjava2.q;

/* renamed from: se8  reason: default package */
public final class se8 implements fjf<re8> {
    private final wlf<f> a;
    private final wlf<PlayOrigin> b;
    private final wlf<c.a> c;
    private final wlf<q> d;
    private final wlf<d> e;
    private final wlf<ExplicitPlaybackCommandHelper> f;
    private final wlf<bre> g;
    private final wlf<cqe> h;
    private final wlf<bec> i;

    public se8(wlf<f> wlf, wlf<PlayOrigin> wlf2, wlf<c.a> wlf3, wlf<q> wlf4, wlf<d> wlf5, wlf<ExplicitPlaybackCommandHelper> wlf6, wlf<bre> wlf7, wlf<cqe> wlf8, wlf<bec> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    public static se8 a(wlf<f> wlf, wlf<PlayOrigin> wlf2, wlf<c.a> wlf3, wlf<q> wlf4, wlf<d> wlf5, wlf<ExplicitPlaybackCommandHelper> wlf6, wlf<bre> wlf7, wlf<cqe> wlf8, wlf<bec> wlf9) {
        return new se8(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new re8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
