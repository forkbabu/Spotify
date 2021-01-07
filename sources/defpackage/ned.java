package defpackage;

import defpackage.hed;
import io.reactivex.functions.g;

/* renamed from: ned  reason: default package */
public final /* synthetic */ class ned implements g {
    public final /* synthetic */ f4d a;

    public /* synthetic */ ned(f4d f4d) {
        this.a = f4d;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c(((hed.d) obj).a());
    }
}
