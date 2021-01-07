package defpackage;

import defpackage.ee2;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* renamed from: ie2  reason: default package */
final class ie2<T> implements n<ee2> {
    final /* synthetic */ String a;

    ie2(String str) {
        this.a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(ee2 ee2) {
        ee2 ee22 = ee2;
        h.e(ee22, "result");
        if (ee22 instanceof ee2.c) {
            return h.a(((ee2.c) ee22).b(), this.a);
        }
        if (ee22 instanceof ee2.a) {
            return h.a(((ee2.a) ee22).a(), this.a);
        }
        return false;
    }
}
