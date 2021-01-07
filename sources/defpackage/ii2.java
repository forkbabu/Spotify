package defpackage;

import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ii2  reason: default package */
public final /* synthetic */ class ii2 implements l {
    public final /* synthetic */ aj2 a;
    public final /* synthetic */ y b;

    public /* synthetic */ ii2(aj2 aj2, y yVar) {
        this.a = aj2;
        this.b = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        aj2 aj2 = this.a;
        return g.K(aj2.b((cj2) obj)).e0(this.b);
    }
}
