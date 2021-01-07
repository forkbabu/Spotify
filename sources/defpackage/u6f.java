package defpackage;

import defpackage.p2f;
import io.reactivex.functions.g;

/* renamed from: u6f  reason: default package */
public final /* synthetic */ class u6f implements g {
    public final /* synthetic */ a8f a;
    public final /* synthetic */ p2f.y b;

    public /* synthetic */ u6f(a8f a8f, p2f.y yVar) {
        this.a = a8f;
        this.b = yVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        this.a.b(this.b.b(), true);
    }
}
