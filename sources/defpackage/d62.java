package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.ui.fragments.logic.n;
import com.spotify.player.sub.l;

/* renamed from: d62  reason: default package */
public final class d62 implements fjf<c62> {
    private final wlf<n> a;
    private final wlf<l> b;
    private final wlf<w> c;

    public d62(wlf<n> wlf, wlf<l> wlf2, wlf<w> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c62(this.a.get(), this.b.get(), this.c.get());
    }
}
