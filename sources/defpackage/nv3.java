package defpackage;

import io.reactivex.functions.l;

/* renamed from: nv3  reason: default package */
public final /* synthetic */ class nv3 implements l {
    public final /* synthetic */ qv3 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ nv3(qv3 qv3, boolean z) {
        this.a = qv3;
        this.b = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (Boolean) obj);
    }
}
