package androidx.fragment.app;

import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class z implements Runnable {
    final /* synthetic */ ArrayList a;

    z(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        e0.n(this.a, 4);
    }
}
