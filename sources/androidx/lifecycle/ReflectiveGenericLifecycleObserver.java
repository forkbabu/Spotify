package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c;

/* access modifiers changed from: package-private */
public class ReflectiveGenericLifecycleObserver implements l {
    private final Object a;
    private final c.a b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = c.c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.l
    public void p(n nVar, Lifecycle.Event event) {
        this.b.a(nVar, event, this.a);
    }
}
