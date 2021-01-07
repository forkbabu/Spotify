package defpackage;

import io.reactivex.functions.g;

/* renamed from: o2e  reason: default package */
public final /* synthetic */ class o2e implements g {
    public final /* synthetic */ s2e a;
    public final /* synthetic */ String b;

    public /* synthetic */ o2e(s2e s2e, String str) {
        this.a = s2e;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, (Throwable) obj);
    }
}
