package defpackage;

import io.reactivex.functions.l;

/* renamed from: h66  reason: default package */
public final /* synthetic */ class h66 implements l {
    public final /* synthetic */ d76 a;
    public final /* synthetic */ z66 b;

    public /* synthetic */ h66(d76 d76, z66 z66) {
        this.a = d76;
        this.b = z66;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.x(this.b, (Boolean) obj);
    }
}
