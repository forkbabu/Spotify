package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.music.connection.l;
import io.reactivex.s;

/* renamed from: e1b  reason: default package */
public final class e1b implements fjf<d1b> {
    private final wlf<l> a;
    private final wlf<w> b;
    private final wlf<String> c;
    private final wlf<s<txa>> d;

    public e1b(wlf<l> wlf, wlf<w> wlf2, wlf<String> wlf3, wlf<s<txa>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d1b(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
