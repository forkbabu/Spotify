package defpackage;

import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: ch7  reason: default package */
public final class ch7<T> implements g<pg7> {
    final /* synthetic */ t8a a;

    ch7(t8a t8a) {
        this.a = t8a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(pg7 pg7) {
        this.a.f(pg7.a(), false);
    }
}
