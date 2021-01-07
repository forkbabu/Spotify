package defpackage;

import io.reactivex.functions.n;

/* access modifiers changed from: package-private */
/* renamed from: hfc  reason: default package */
public final class hfc<T> implements n<Integer> {
    final /* synthetic */ gfc a;

    hfc(gfc gfc) {
        this.a = gfc;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(Integer num) {
        return this.a.c.e(num.intValue());
    }
}
