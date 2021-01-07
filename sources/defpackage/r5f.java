package defpackage;

import defpackage.p2f;
import io.reactivex.functions.g;

/* renamed from: r5f  reason: default package */
public final /* synthetic */ class r5f implements g {
    public final /* synthetic */ a8f a;
    public final /* synthetic */ p2f.h b;

    public /* synthetic */ r5f(a8f a8f, p2f.h hVar) {
        this.a = a8f;
        this.b = hVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        this.a.b(this.b.a(), true);
    }
}
