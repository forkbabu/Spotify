package defpackage;

import com.spotify.base.java.logging.Logger;
import defpackage.h2d;
import defpackage.i2d;
import defpackage.l2d;
import defpackage.v2d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: y2d  reason: default package */
final class y2d<T, R> implements l<Throwable, i2d.c> {
    final /* synthetic */ v2d.b a;
    final /* synthetic */ h2d.d b;

    y2d(v2d.b bVar, h2d.d dVar) {
        this.a = bVar;
        this.b = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public i2d.c apply(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "it");
        Logger.e(th2, "Error sharing:", new Object[0]);
        v2d v2d = this.a.a;
        h2d.d dVar = this.b;
        h.d(dVar, "effect");
        v2d.d(v2d, dVar, null);
        return new i2d.c(new l2d.a(this.b.c(), this.b.a()));
    }
}
