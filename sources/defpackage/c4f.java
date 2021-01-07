package defpackage;

import io.reactivex.functions.g;

/* renamed from: c4f  reason: default package */
public final /* synthetic */ class c4f implements g {
    public final /* synthetic */ a8f a;
    public final /* synthetic */ String b;

    public /* synthetic */ c4f(a8f a8f, String str) {
        this.a = a8f;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zwd zwd = (zwd) obj;
        this.a.b(this.b, false);
    }
}
