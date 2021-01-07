package defpackage;

import io.reactivex.functions.c;

/* renamed from: jca  reason: default package */
public final /* synthetic */ class jca implements c {
    public static final /* synthetic */ jca a = new jca();

    private /* synthetic */ jca() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        u3 u3Var = (u3) obj;
        u3 u3Var2 = (u3) obj2;
        F f = u3Var.a;
        S s = u3Var.b;
        if (f == null) {
            f = u3Var2.a;
        }
        if (s == null) {
            s = u3Var2.b;
        }
        return new u3(f, s);
    }
}
