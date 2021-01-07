package defpackage;

import com.spotify.pageloader.o0;
import com.spotify.pageloader.t0;
import kotlin.jvm.internal.h;

/* renamed from: pac  reason: default package */
public final class pac<T> implements ctd {
    private final t0<T> a;

    public pac(zac zac, o0<T> o0Var) {
        h.e(zac, "pageLoaderFactory");
        h.e(o0Var, "loadable");
        t0<T> a2 = zac.a(o0Var);
        h.d(a2, "pageLoaderFactory.createPageLoader(loadable)");
        this.a = a2;
    }

    public final t0<T> a() {
        return this.a;
    }

    @Override // defpackage.ctd
    public void start() {
        this.a.start();
    }

    @Override // defpackage.ctd
    public void stop() {
        this.a.stop();
    }
}
