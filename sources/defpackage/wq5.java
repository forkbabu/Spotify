package defpackage;

import io.reactivex.functions.l;

/* renamed from: wq5  reason: default package */
public final /* synthetic */ class wq5 implements l {
    public final /* synthetic */ Boolean a;

    public /* synthetic */ wq5(Boolean bool) {
        this.a = bool;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.booleanValue() && !((Boolean) obj).booleanValue());
    }
}
