package defpackage;

import com.spotify.mobile.android.ui.activity.c;
import io.reactivex.y;

/* renamed from: qt9  reason: default package */
public final class qt9 implements fjf<pt9> {
    private final wlf<at9> a;
    private final wlf<y> b;
    private final wlf<ps9> c;
    private final wlf<cqe> d;
    private final wlf<c> e;

    public qt9(wlf<at9> wlf, wlf<y> wlf2, wlf<ps9> wlf3, wlf<cqe> wlf4, wlf<c> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pt9(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
