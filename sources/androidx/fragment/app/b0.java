package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class b0 implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ j0 b;
    final /* synthetic */ View c;
    final /* synthetic */ Fragment f;
    final /* synthetic */ ArrayList n;
    final /* synthetic */ ArrayList o;
    final /* synthetic */ ArrayList p;
    final /* synthetic */ Object q;

    b0(Object obj, j0 j0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.a = obj;
        this.b = j0Var;
        this.c = view;
        this.f = fragment;
        this.n = arrayList;
        this.o = arrayList2;
        this.p = arrayList3;
        this.q = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.a;
        if (obj != null) {
            this.b.m(obj, this.c);
            this.o.addAll(e0.h(this.b, this.a, this.f, this.n, this.c));
        }
        if (this.p != null) {
            if (this.q != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.c);
                this.b.n(this.q, this.p, arrayList);
            }
            this.p.clear();
            this.p.add(this.c);
        }
    }
}
