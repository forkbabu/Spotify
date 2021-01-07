package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public class h0 implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ Map b;

    h0(j0 j0Var, ArrayList arrayList, Map map) {
        this.a = arrayList;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            String s = q4.s(view);
            if (s != null) {
                Iterator it = this.b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (s.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                q4.T(view, str);
            }
        }
    }
}
