package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: qu  reason: default package */
public final class qu extends WeakReference<Throwable> {
    private final int a;

    public qu(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == qu.class) {
            if (this == obj) {
                return true;
            }
            qu quVar = (qu) obj;
            if (this.a == quVar.a && get() == quVar.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.a;
    }
}
