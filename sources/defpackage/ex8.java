package defpackage;

import io.reactivex.functions.l;

/* renamed from: ex8  reason: default package */
public final /* synthetic */ class ex8 implements l {
    public final /* synthetic */ iy8 a;
    public final /* synthetic */ vx8 b;
    public final /* synthetic */ yda c;

    public /* synthetic */ ex8(iy8 iy8, vx8 vx8, yda yda) {
        this.a = iy8;
        this.b = vx8;
        this.c = yda;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.l(this.b, this.c, (String) obj);
    }
}
