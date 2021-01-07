package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import io.reactivex.g;

/* renamed from: dnc  reason: default package */
public final class dnc implements fjf<bnc> {
    private final wlf<f> a;
    private final wlf<lxd> b;
    private final wlf<d> c;
    private final wlf<bre> d;
    private final wlf<g<Boolean>> e;
    private final wlf<g<Optional<String>>> f;
    private final wlf<g<String>> g;

    public dnc(wlf<f> wlf, wlf<lxd> wlf2, wlf<d> wlf3, wlf<bre> wlf4, wlf<g<Boolean>> wlf5, wlf<g<Optional<String>>> wlf6, wlf<g<String>> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static dnc a(wlf<f> wlf, wlf<lxd> wlf2, wlf<d> wlf3, wlf<bre> wlf4, wlf<g<Boolean>> wlf5, wlf<g<Optional<String>>> wlf6, wlf<g<String>> wlf7) {
        return new dnc(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bnc(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
