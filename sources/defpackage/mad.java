package defpackage;

import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: mad  reason: default package */
public final class mad<T> implements g<Throwable> {
    final /* synthetic */ oad a;

    mad(oad oad) {
        this.a = oad;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        oad.e(this.a, th.getMessage());
    }
}
