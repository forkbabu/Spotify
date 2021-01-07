package defpackage;

import defpackage.h2d;
import defpackage.i2d;
import defpackage.l2d;
import defpackage.v2d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: x2d  reason: default package */
final class x2d<T, R> implements l<String, i2d.c> {
    final /* synthetic */ v2d.b a;
    final /* synthetic */ h2d.d b;

    x2d(v2d.b bVar, h2d.d dVar) {
        this.a = bVar;
        this.b = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public i2d.c apply(String str) {
        String str2 = str;
        h.e(str2, "shareId");
        v2d v2d = this.a.a;
        h2d.d dVar = this.b;
        h.d(dVar, "effect");
        v2d.d(v2d, dVar, str2);
        return new i2d.c(l2d.c.a);
    }
}
