package defpackage;

import io.reactivex.functions.g;

/* renamed from: g4e  reason: default package */
public final /* synthetic */ class g4e implements g {
    public final /* synthetic */ l4e a;
    public final /* synthetic */ b4e b;

    public /* synthetic */ g4e(l4e l4e, b4e b4e) {
        this.a = l4e;
        this.b = b4e;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (w3e) obj);
    }
}
