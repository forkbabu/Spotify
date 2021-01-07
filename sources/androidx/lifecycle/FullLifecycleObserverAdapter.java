package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* access modifiers changed from: package-private */
public class FullLifecycleObserverAdapter implements l {
    private final g a;
    private final l b;

    FullLifecycleObserverAdapter(g gVar, l lVar) {
        this.a = gVar;
        this.b = lVar;
    }

    @Override // androidx.lifecycle.l
    public void p(n nVar, Lifecycle.Event event) {
        switch (event.ordinal()) {
            case 0:
                this.a.n(nVar);
                break;
            case 1:
                this.a.o0(nVar);
                break;
            case 2:
                this.a.V(nVar);
                break;
            case 3:
                this.a.a0(nVar);
                break;
            case 4:
                this.a.d0(nVar);
                break;
            case 5:
                this.a.h0(nVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        l lVar = this.b;
        if (lVar != null) {
            lVar.p(nVar, event);
        }
    }
}
