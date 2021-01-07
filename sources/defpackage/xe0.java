package defpackage;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import kotlin.jvm.internal.Ref$ObjectRef;

/* access modifiers changed from: package-private */
/* renamed from: xe0  reason: default package */
public final class xe0<T> implements g<b> {
    final /* synthetic */ Ref$ObjectRef a;
    final /* synthetic */ ae0 b;
    final /* synthetic */ cqe c;
    final /* synthetic */ pe0 f;
    final /* synthetic */ re0 n;

    xe0(Ref$ObjectRef ref$ObjectRef, ae0 ae0, cqe cqe, pe0 pe0, re0 re0) {
        this.a = ref$ObjectRef;
        this.b = ae0;
        this.c = cqe;
        this.f = pe0;
        this.n = re0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(b bVar) {
        this.a.element = (T) zd0.a(this.b, this.c, this.f, this.n);
    }
}
