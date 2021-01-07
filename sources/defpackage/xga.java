package defpackage;

import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* renamed from: xga  reason: default package */
final class xga<T> implements n<tga> {
    public static final xga a = new xga();

    xga() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(tga tga) {
        tga tga2 = tga;
        h.e(tga2, "it");
        return h.a(tga2.a(), "google_assistant");
    }
}
