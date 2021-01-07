package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* access modifiers changed from: package-private */
public class i0 implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ Map b;

    i0(j0 j0Var, ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            q4.T(view, (String) this.b.get(q4.s(view)));
        }
    }
}
