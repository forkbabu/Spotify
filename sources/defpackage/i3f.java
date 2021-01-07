package defpackage;

import defpackage.p2f;
import io.reactivex.functions.g;

/* renamed from: i3f  reason: default package */
public final /* synthetic */ class i3f implements g {
    public final /* synthetic */ a8f a;
    public final /* synthetic */ p2f.q b;

    public /* synthetic */ i3f(a8f a8f, p2f.q qVar) {
        this.a = a8f;
        this.b = qVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        this.a.b(this.b.a(), true);
    }
}
