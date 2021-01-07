package defpackage;

import com.spotify.music.nowplaying.common.view.contextmenu.o;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: q0c  reason: default package */
public final class q0c implements fjf<g<o>> {

    /* access modifiers changed from: private */
    /* renamed from: q0c$a */
    public static final class a {
        private static final q0c a = new q0c();
    }

    public static q0c a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        o.b.a a2 = o.b.a();
        a2.c(false);
        a2.d(true);
        a2.e(true);
        a2.g(true);
        a2.b(true);
        a2.f(true);
        o.b a3 = a2.a();
        o.a a4 = o.a();
        a4.b(a3);
        g N = g.N(a4.a());
        h.d(N, "ContextMenuConfiguration…let { Flowable.just(it) }");
        return N;
    }
}
