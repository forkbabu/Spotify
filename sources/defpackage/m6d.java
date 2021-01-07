package defpackage;

import defpackage.h6d;
import io.reactivex.functions.g;

/* renamed from: m6d  reason: default package */
public final /* synthetic */ class m6d implements g {
    public final /* synthetic */ f4d a;

    public /* synthetic */ m6d(f4d f4d) {
        this.a = f4d;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j(((h6d.c) obj).b());
    }
}
