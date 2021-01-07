package defpackage;

import defpackage.g2d;
import defpackage.i2d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: s2d  reason: default package */
final class s2d<T, R> implements l<szc, i2d.d> {
    public static final s2d a = new s2d();

    s2d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public i2d.d apply(szc szc) {
        szc szc2 = szc;
        h.e(szc2, "previewData");
        return new i2d.d(new g2d.c(szc2));
    }
}
