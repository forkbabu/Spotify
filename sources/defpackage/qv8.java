package defpackage;

import io.reactivex.functions.g;

/* renamed from: qv8  reason: default package */
public final /* synthetic */ class qv8 implements g {
    public final /* synthetic */ aw8 a;

    public /* synthetic */ qv8(aw8 aw8) {
        this.a = aw8;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(((Boolean) obj).booleanValue());
    }
}
