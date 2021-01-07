package defpackage;

import com.spotify.music.v;
import defpackage.tfb;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* renamed from: agb  reason: default package */
final class agb<T> implements g<tfb.d> {
    final /* synthetic */ v a;

    agb(v vVar) {
        this.a = vVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(tfb.d dVar) {
        tfb.d dVar2 = dVar;
        h.e(dVar2, "handleSessionStateChanged");
        this.a.a(dVar2.a());
    }
}
