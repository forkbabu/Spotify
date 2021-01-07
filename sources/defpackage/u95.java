package defpackage;

import io.reactivex.functions.g;

/* renamed from: u95  reason: default package */
public final /* synthetic */ class u95 implements g {
    public final /* synthetic */ ma5 a;

    public /* synthetic */ u95(ma5 ma5) {
        this.a = ma5;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        ((ka5) this.a).b();
    }
}
