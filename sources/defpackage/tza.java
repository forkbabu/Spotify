package defpackage;

import io.reactivex.functions.l;

/* renamed from: tza  reason: default package */
public final /* synthetic */ class tza implements l {
    public final /* synthetic */ tz0 a;

    public /* synthetic */ tza(tz0 tz0) {
        this.a = tz0;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        tz0 tz0 = this.a;
        Throwable th = (Throwable) obj;
        return zya.i(yya.d(tz0.b() != null ? tz0.b() : ""));
    }
}
