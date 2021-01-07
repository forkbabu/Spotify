package defpackage;

import android.view.View;
import com.google.common.base.Optional;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import io.reactivex.y;

/* renamed from: j5e  reason: default package */
public final class j5e implements fjf<i5e> {
    private final wlf<SnackbarManager> a;
    private final wlf<Optional<tg0<View>>> b;
    private final wlf<y> c;
    private final wlf<x3e> d;

    public j5e(wlf<SnackbarManager> wlf, wlf<Optional<tg0<View>>> wlf2, wlf<y> wlf3, wlf<x3e> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i5e(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
