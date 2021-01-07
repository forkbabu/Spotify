package defpackage;

import defpackage.g2d;
import defpackage.i2d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: t2d  reason: default package */
final class t2d<T, R> implements l<Throwable, i2d.d> {
    public static final t2d a = new t2d();

    t2d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public i2d.d apply(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "exception");
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        return new i2d.d(new g2d.a(message, null, 2));
    }
}
