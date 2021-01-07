package defpackage;

import defpackage.hz4;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: oz4  reason: default package */
public final class oz4<T> implements g<hz4.a> {
    final /* synthetic */ dz4 a;
    final /* synthetic */ nmf b;

    oz4(dz4 dz4, nmf nmf) {
        this.a = dz4;
        this.b = nmf;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(hz4.a aVar) {
        hz4.a aVar2 = aVar;
        this.a.a(aVar2.a().a());
        this.b.invoke(aVar2.a());
    }
}
