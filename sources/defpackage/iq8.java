package defpackage;

import io.reactivex.functions.l;

/* renamed from: iq8  reason: default package */
public final /* synthetic */ class iq8 implements l {
    public final /* synthetic */ lq8 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ iq8(lq8 lq8, boolean z) {
        this.a = lq8;
        this.b = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Boolean) obj);
    }
}
