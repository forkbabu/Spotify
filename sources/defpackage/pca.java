package defpackage;

import io.reactivex.functions.g;

/* renamed from: pca  reason: default package */
public final /* synthetic */ class pca implements g {
    public final /* synthetic */ xca a;
    public final /* synthetic */ int b;

    public /* synthetic */ pca(xca xca, int i) {
        this.a = xca;
        this.b = i;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (Float) obj);
    }
}
