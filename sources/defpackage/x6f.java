package defpackage;

import defpackage.p2f;
import io.reactivex.functions.l;

/* renamed from: x6f  reason: default package */
public final /* synthetic */ class x6f implements l {
    public final /* synthetic */ q7f a;

    public /* synthetic */ x6f(q7f q7f) {
        this.a = q7f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p2f.b bVar = (p2f.b) obj;
        return this.a.dismiss().N();
    }
}
