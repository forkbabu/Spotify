package defpackage;

import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: e48  reason: default package */
public final /* synthetic */ class e48 implements l {
    public final /* synthetic */ l38 a;
    public final /* synthetic */ g48 b;

    public /* synthetic */ e48(l38 l38, g48 g48) {
        this.a = l38;
        this.b = g48;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        l38 l38 = this.a;
        g48 g48 = this.b;
        if (((Boolean) obj).booleanValue()) {
            return l38.a().j0(b48.a).r0(new c48(g48));
        }
        return s.i0(y38.b(g48.b()));
    }
}
