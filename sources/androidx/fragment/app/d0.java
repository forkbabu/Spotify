package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.e0;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class d0 implements Runnable {
    final /* synthetic */ j0 a;
    final /* synthetic */ m1 b;
    final /* synthetic */ Object c;
    final /* synthetic */ e0.b f;
    final /* synthetic */ ArrayList n;
    final /* synthetic */ View o;
    final /* synthetic */ Fragment p;
    final /* synthetic */ Fragment q;
    final /* synthetic */ boolean r;
    final /* synthetic */ ArrayList s;
    final /* synthetic */ Object t;
    final /* synthetic */ Rect u;

    d0(j0 j0Var, m1 m1Var, Object obj, e0.b bVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.a = j0Var;
        this.b = m1Var;
        this.c = obj;
        this.f = bVar;
        this.n = arrayList;
        this.o = view;
        this.p = fragment;
        this.q = fragment2;
        this.r = z;
        this.s = arrayList2;
        this.t = obj2;
        this.u = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        m1<String, View> e = e0.e(this.a, this.b, this.c, this.f);
        if (e != null) {
            this.n.addAll(e.values());
            this.n.add(this.o);
        }
        e0.c(this.p, this.q, this.r, e, false);
        Object obj = this.c;
        if (obj != null) {
            this.a.u(obj, this.s, this.n);
            View k = e0.k(e, this.f, this.t, this.r);
            if (k != null) {
                this.a.j(k, this.u);
            }
        }
    }
}
