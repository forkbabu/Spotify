package defpackage;

import io.reactivex.functions.l;

/* renamed from: sp5  reason: default package */
public class sp5 implements l<u3<Boolean, b91>, b91> {
    private final to5 a;

    public sp5(to5 to5) {
        this.a = to5;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public b91 apply(u3<Boolean, b91> u3Var) {
        u3<Boolean, b91> u3Var2 = u3Var;
        S s = u3Var2.b;
        F f = u3Var2.a;
        f.getClass();
        if (f.booleanValue()) {
            return s;
        }
        int i = t71.c;
        boolean z = false;
        if ("hubs/placeholder".equals(s.id()) && !s.overlays().isEmpty() && "made-for-you-hub-error-empty-view".equals(((s81) s.overlays().get(0)).custom().string("tag"))) {
            z = true;
        }
        return z ? this.a.d() : s;
    }
}
