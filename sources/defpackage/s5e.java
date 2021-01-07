package defpackage;

import android.view.View;
import com.google.common.base.Optional;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.share.util.c;
import com.spotify.share.util.g;
import com.spotify.share.util.o;

/* renamed from: s5e  reason: default package */
public final class s5e implements fjf<r5e> {
    private final wlf<o> a;
    private final wlf<c> b;
    private final wlf<g> c;
    private final wlf<Optional<g6e>> d;
    private final wlf<SnackbarManager> e;
    private final wlf<Optional<tg0<View>>> f;

    public s5e(wlf<o> wlf, wlf<c> wlf2, wlf<g> wlf3, wlf<Optional<g6e>> wlf4, wlf<SnackbarManager> wlf5, wlf<Optional<tg0<View>>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r5e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
