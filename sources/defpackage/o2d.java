package defpackage;

import com.spotify.mobile.android.video.g0;
import com.spotify.mobile.android.video.l0;
import com.spotify.mobile.android.video.r;
import com.spotify.mobile.android.video.s;
import com.spotify.mobile.android.video.t;
import defpackage.n2d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: o2d  reason: default package */
final class o2d<T, R> implements l<p62, r> {
    final /* synthetic */ n2d.b a;

    o2d(n2d.b bVar) {
        this.a = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public r apply(p62 p62) {
        p62 p622 = p62;
        h.e(p622, "it");
        s a2 = n2d.b(this.a.a).a(p622).a();
        a2.d("share-menu-v2");
        a2.i(new l0());
        a2.g(false);
        g0.a a3 = g0.a();
        a3.b(false);
        a2.f(a3.a());
        r a4 = a2.a();
        ((t) a4).a0(true);
        return a4;
    }
}
