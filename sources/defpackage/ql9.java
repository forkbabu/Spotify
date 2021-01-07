package defpackage;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.loggers.ImpressionLogger;
import io.reactivex.y;

/* renamed from: ql9  reason: default package */
public final class ql9 implements fjf<pl9> {
    private final wlf<ll9> a;
    private final wlf<nl9> b;
    private final wlf<tl9> c;
    private final wlf<rl9> d;
    private final wlf<jl9> e;
    private final wlf<y> f;
    private final wlf<ImpressionLogger> g;
    private final wlf<k> h;
    private final wlf<fm9> i;
    private final wlf<c> j;

    public ql9(wlf<ll9> wlf, wlf<nl9> wlf2, wlf<tl9> wlf3, wlf<rl9> wlf4, wlf<jl9> wlf5, wlf<y> wlf6, wlf<ImpressionLogger> wlf7, wlf<k> wlf8, wlf<fm9> wlf9, wlf<c> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    public static ql9 a(wlf<ll9> wlf, wlf<nl9> wlf2, wlf<tl9> wlf3, wlf<rl9> wlf4, wlf<jl9> wlf5, wlf<y> wlf6, wlf<ImpressionLogger> wlf7, wlf<k> wlf8, wlf<fm9> wlf9, wlf<c> wlf10) {
        return new ql9(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pl9(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
