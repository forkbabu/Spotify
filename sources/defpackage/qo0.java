package defpackage;

import defpackage.io0;
import io.reactivex.functions.l;

/* renamed from: qo0  reason: default package */
public final /* synthetic */ class qo0 implements l {
    public final /* synthetic */ mp0 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ qo0(mp0 mp0, boolean z) {
        this.a = mp0;
        this.b = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        io0.b bVar = (io0.b) obj;
        return this.a.b(this.b, bVar.a(), bVar.b()).j0(oo0.a).r0(po0.a);
    }
}
