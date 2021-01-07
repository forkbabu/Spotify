package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.container.app.foregroundstate.d;
import io.reactivex.y;

/* renamed from: gbd  reason: default package */
public final class gbd implements fjf<fbd> {
    private final wlf<Context> a;
    private final wlf<f4d> b;
    private final wlf<t7d> c;
    private final wlf<y> d;
    private final wlf<d> e;
    private final wlf<NotificationManager> f;
    private final wlf<SnackbarManager> g;
    private final wlf<qcd> h;
    private final wlf<cfd> i;

    public gbd(wlf<Context> wlf, wlf<f4d> wlf2, wlf<t7d> wlf3, wlf<y> wlf4, wlf<d> wlf5, wlf<NotificationManager> wlf6, wlf<SnackbarManager> wlf7, wlf<qcd> wlf8, wlf<cfd> wlf9) {
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

    @Override // defpackage.wlf
    public Object get() {
        return new fbd(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
