package defpackage;

import defpackage.h6d;
import io.reactivex.functions.g;

/* renamed from: c7d  reason: default package */
public final /* synthetic */ class c7d implements g {
    public final /* synthetic */ u7d a;
    public final /* synthetic */ q7d b;
    public final /* synthetic */ x9d c;

    public /* synthetic */ c7d(u7d u7d, q7d q7d, x9d x9d) {
        this.a = u7d;
        this.b = q7d;
        this.c = x9d;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        u7d u7d = this.a;
        q7d q7d = this.b;
        x9d x9d = this.c;
        h6d.f fVar = (h6d.f) obj;
        u7d.c(new v6d(q7d, x9d), new o6d(x9d));
    }
}
