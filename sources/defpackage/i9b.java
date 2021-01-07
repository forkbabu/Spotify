package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.rx.w;
import io.reactivex.d0;
import io.reactivex.s;

/* renamed from: i9b  reason: default package */
public class i9b {
    private final w a;
    private final fm9 b;
    private final v c;

    public i9b(w wVar, fm9 fm9, v vVar) {
        this.a = wVar;
        this.b = fm9;
        this.c = vVar;
    }

    public /* synthetic */ d0 a(Optional optional) {
        return this.c.b().E();
    }

    public s<Boolean> b() {
        s<R> L0 = this.a.c(em9.c.d()).L0(new b9b(this));
        fm9 fm9 = this.b;
        fm9.getClass();
        return L0.j0(new v8b(fm9)).E();
    }
}
