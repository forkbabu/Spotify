package defpackage;

import io.reactivex.functions.c;

/* renamed from: b5b  reason: default package */
public class b5b implements c<b91, b91, b91> {
    b5b() {
    }

    private static b91 b(b91 b91, b91 b912) {
        return b912.custom().boolValue("isLastPage", false) ? b91.toBuilder().d("isLastPage", Boolean.TRUE).g() : b91;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public b91 a(b91 b91, b91 b912) {
        b91 b913 = b91;
        b91 b914 = b912;
        boolean z = true;
        if (rqa.f(b913).equals(rqa.f(b914))) {
            if ((!b913.body().isEmpty()) && (!b914.body().isEmpty())) {
                if (rqa.d(b914) <= rqa.d(b913)) {
                    z = false;
                }
                if (z) {
                    return f8b.a(b913, b914);
                }
                return b913;
            } else if (!b913.body().isEmpty()) {
                return b(b913, b914);
            }
        } else if ((!b913.body().isEmpty()) && rqa.f(b914).isEmpty()) {
            return b(b913, b914);
        }
        return b914;
    }
}
