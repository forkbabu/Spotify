package defpackage;

import io.reactivex.functions.c;

/* renamed from: u4b  reason: default package */
public class u4b implements c<b91, b91, b91> {
    u4b() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public b91 a(b91 b91, b91 b912) {
        b91 b913 = b91;
        b91 b914 = b912;
        boolean z = true;
        if ((!b913.body().isEmpty()) && (!b914.body().isEmpty())) {
            if (rqa.d(b914) <= rqa.d(b913)) {
                z = false;
            }
            if (z) {
                return f8b.a(b913, b914);
            }
            return b913;
        } else if (!b913.body().isEmpty()) {
            return b914.custom().boolValue("isLastPage", false) ? b913.toBuilder().d("isLastPage", Boolean.TRUE).g() : b913;
        } else {
            return b914;
        }
    }
}
