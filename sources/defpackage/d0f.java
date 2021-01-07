package defpackage;

import io.reactivex.functions.g;

/* renamed from: d0f  reason: default package */
public final /* synthetic */ class d0f implements g {
    public final /* synthetic */ l0f a;
    public final /* synthetic */ String[] b;

    public /* synthetic */ d0f(l0f l0f, String[] strArr) {
        this.a = l0f;
        this.b = strArr;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.E(this.b, (Long) obj);
    }
}
