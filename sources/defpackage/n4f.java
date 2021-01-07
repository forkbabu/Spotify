package defpackage;

import defpackage.p2f;
import io.reactivex.functions.g;

/* renamed from: n4f  reason: default package */
public final /* synthetic */ class n4f implements g {
    public final /* synthetic */ a8f a;
    public final /* synthetic */ p2f.v b;

    public /* synthetic */ n4f(a8f a8f, p2f.v vVar) {
        this.a = a8f;
        this.b = vVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        this.a.b(this.b.b(), true);
    }
}
