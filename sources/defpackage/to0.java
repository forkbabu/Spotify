package defpackage;

import defpackage.io0;
import io.reactivex.functions.l;

/* renamed from: to0  reason: default package */
public final /* synthetic */ class to0 implements l {
    public final /* synthetic */ jp0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean f;

    public /* synthetic */ to0(jp0 jp0, String str, boolean z, boolean z2) {
        this.a = jp0;
        this.b = str;
        this.c = z;
        this.f = z2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        io0.c cVar = (io0.c) obj;
        return this.a.b(cVar.c(), this.b, cVar.d(), this.c, cVar.e(), cVar.a(), cVar.b(), this.f).j0(uo0.a).r0(xo0.a);
    }
}
