package defpackage;

import defpackage.tfb;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* renamed from: zfb  reason: default package */
final class zfb<T> implements g<tfb.c> {
    final /* synthetic */ com.spotify.android.flags.g a;

    zfb(com.spotify.android.flags.g gVar) {
        this.a = gVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(tfb.c cVar) {
        tfb.c cVar2 = cVar;
        h.e(cVar2, "handleFlagsChanged");
        this.a.a(cVar2.a());
    }
}
