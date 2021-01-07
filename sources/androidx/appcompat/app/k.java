package androidx.appcompat.app;

import android.view.View;
import defpackage.b5;

/* access modifiers changed from: package-private */
public class k implements m4 {
    final /* synthetic */ j a;

    k(j jVar) {
        this.a = jVar;
    }

    @Override // defpackage.m4
    public b5 onApplyWindowInsets(View view, b5 b5Var) {
        int j = b5Var.j();
        int e0 = this.a.e0(b5Var, null);
        if (j != e0) {
            int h = b5Var.h();
            int i = b5Var.i();
            int g = b5Var.g();
            b5.a aVar = new b5.a(b5Var);
            aVar.c(t2.a(h, e0, i, g));
            b5Var = aVar.a();
        }
        return q4.B(view, b5Var);
    }
}
