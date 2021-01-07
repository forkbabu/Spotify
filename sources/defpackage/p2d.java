package defpackage;

import com.spotify.mobile.android.video.r;
import com.spotify.music.share.v2.view.b;
import defpackage.n2d;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* renamed from: p2d  reason: default package */
final class p2d<T> implements g<r> {
    final /* synthetic */ n2d.b a;

    p2d(n2d.b bVar) {
        this.a = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(r rVar) {
        r rVar2 = rVar;
        b d = n2d.d(this.a.a);
        h.d(rVar2, "it");
        d.a(rVar2);
    }
}
