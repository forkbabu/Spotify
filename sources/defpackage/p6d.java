package defpackage;

import defpackage.h6d;
import io.reactivex.functions.g;

/* renamed from: p6d  reason: default package */
public final /* synthetic */ class p6d implements g {
    public final /* synthetic */ u7d a;
    public final /* synthetic */ q7d b;
    public final /* synthetic */ x9d c;

    public /* synthetic */ p6d(u7d u7d, q7d q7d, x9d x9d) {
        this.a = u7d;
        this.b = q7d;
        this.c = x9d;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        u7d u7d = this.a;
        q7d q7d = this.b;
        x9d x9d = this.c;
        u7d.e(new a7d(q7d, x9d), new z6d(x9d), ((h6d.g) obj).b().orNull());
    }
}
