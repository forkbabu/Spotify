package defpackage;

import defpackage.f57;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* renamed from: v47  reason: default package */
final class v47<T> implements g<boa> {
    final /* synthetic */ w47 a;

    v47(w47 w47) {
        this.a = w47;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(boa boa) {
        boa boa2 = boa;
        y47 p = w47.p(this.a);
        h.d(boa2, "it");
        p.g(boa2);
        this.a.v.a(new f57.a(boa2));
    }
}
