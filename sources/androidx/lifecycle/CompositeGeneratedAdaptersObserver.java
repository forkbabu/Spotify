package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* access modifiers changed from: package-private */
public class CompositeGeneratedAdaptersObserver implements l {
    private final h[] a;

    CompositeGeneratedAdaptersObserver(h[] hVarArr) {
        this.a = hVarArr;
    }

    @Override // androidx.lifecycle.l
    public void p(n nVar, Lifecycle.Event event) {
        t tVar = new t();
        for (h hVar : this.a) {
            hVar.a(nVar, event, false, tVar);
        }
        for (h hVar2 : this.a) {
            hVar2.a(nVar, event, true, tVar);
        }
    }
}
