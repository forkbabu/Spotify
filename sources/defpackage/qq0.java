package defpackage;

import io.reactivex.functions.g;

/* renamed from: qq0  reason: default package */
public final /* synthetic */ class qq0 implements g {
    public final /* synthetic */ yq0 a;

    public /* synthetic */ qq0(yq0 yq0) {
        this.a = yq0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        yq0.a(this.a, (Throwable) obj);
    }
}
