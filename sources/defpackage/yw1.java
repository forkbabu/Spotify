package defpackage;

import io.reactivex.functions.g;

/* renamed from: yw1  reason: default package */
public final /* synthetic */ class yw1 implements g {
    public final /* synthetic */ zw1 a;

    public /* synthetic */ yw1(zw1 zw1) {
        this.a = zw1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.r(((Boolean) obj).booleanValue());
    }
}
