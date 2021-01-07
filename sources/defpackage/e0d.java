package defpackage;

import io.reactivex.functions.g;

/* renamed from: e0d  reason: default package */
public final /* synthetic */ class e0d implements g {
    public final /* synthetic */ u0d a;
    public final /* synthetic */ o8e b;
    public final /* synthetic */ int c;

    public /* synthetic */ e0d(u0d u0d, o8e o8e, int i) {
        this.a = u0d;
        this.b = o8e;
        this.c = i;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, this.c, (u3) obj);
    }
}
