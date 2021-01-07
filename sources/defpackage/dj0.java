package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dj0  reason: default package */
public final /* synthetic */ class dj0 implements wi0 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ gj0 b;
    public final /* synthetic */ wi0 c;

    public /* synthetic */ dj0(AtomicReference atomicReference, gj0 gj0, wi0 wi0) {
        this.a = atomicReference;
        this.b = gj0;
        this.c = wi0;
    }

    @Override // defpackage.wi0
    public final void a(Object obj) {
        AtomicReference atomicReference = this.a;
        gj0 gj0 = this.b;
        wi0 wi0 = this.c;
        Object obj2 = atomicReference.get();
        if (obj2 == null || gj0.a(obj2, obj)) {
            wi0.a(obj);
        }
        atomicReference.set(obj);
    }
}
