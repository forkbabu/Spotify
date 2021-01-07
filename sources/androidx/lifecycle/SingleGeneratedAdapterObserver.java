package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* access modifiers changed from: package-private */
public class SingleGeneratedAdapterObserver implements l {
    private final h a;

    SingleGeneratedAdapterObserver(h hVar) {
        this.a = hVar;
    }

    @Override // androidx.lifecycle.l
    public void p(n nVar, Lifecycle.Event event) {
        this.a.a(nVar, event, false, null);
        this.a.a(nVar, event, true, null);
    }
}
