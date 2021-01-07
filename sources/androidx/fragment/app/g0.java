package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class g0 implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ ArrayList f;
    final /* synthetic */ ArrayList n;

    g0(j0 j0Var, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.f = arrayList3;
        this.n = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.a; i++) {
            q4.T((View) this.b.get(i), (String) this.c.get(i));
            q4.T((View) this.f.get(i), (String) this.n.get(i));
        }
    }
}
