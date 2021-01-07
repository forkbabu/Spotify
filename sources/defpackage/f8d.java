package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.s;
import com.spotify.mobius.t;
import defpackage.n8d;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: f8d  reason: default package */
public final class f8d<M, F> implements t<r8d, n8d> {
    public static final f8d a = new f8d();

    f8d() {
    }

    /* Return type fixed from 'com.spotify.mobius.s' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobius.t
    public s<r8d, n8d> a(r8d r8d) {
        r8d r8d2 = r8d;
        h.e(r8d2, "model");
        h.e(r8d2, "model");
        Logger.b("social listening impl: init", new Object[0]);
        s<r8d, n8d> c = s.c(r8d.b(r8d2, false, 0, null, false, true, false, false, false, false, null, null, null, null, false, false, false, 48654), d.G(n8d.c.a));
        h.d(c, "First.first(newModel, setOf(GetCurrentSession))");
        return c;
    }
}
