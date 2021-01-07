package defpackage;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.connection.l;
import io.reactivex.y;

/* renamed from: sl2  reason: default package */
public final class sl2 implements fjf<rl2> {
    private final wlf<y> a;
    private final wlf<k> b;
    private final wlf<l> c;

    public sl2(wlf<y> wlf, wlf<k> wlf2, wlf<l> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rl2(this.a.get(), this.b.get(), this.c.get());
    }
}
