package defpackage;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: ro0  reason: default package */
public final /* synthetic */ class ro0 implements w {
    public final /* synthetic */ jp0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ro0(jp0 jp0, String str, boolean z, boolean z2) {
        this.a = jp0;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new to0(this.a, this.b, this.c, this.d), false, Integer.MAX_VALUE);
    }
}
